package org.ashish.movierecommender.service;
import org.ashish.movierecommender.dto.MovieDTO;
import org.ashish.movierecommender.model.Movie;
import org.ashish.movierecommender.repository.MovieRepository;
import org.ashish.movierecommender.repository.RatingRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private RatingRepository ratingRepository;

    public MovieDTO getMovie(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        return convertToDTO(movie);
    }

    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private MovieDTO convertToDTO(Movie movie) {
        MovieDTO dto = new MovieDTO();
        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setGenre(movie.getGenre());
        dto.setReleaseYear(movie.getReleaseYear());
        dto.setDirector(movie.getDirector());
        dto.setAverageRating(ratingRepository.getAverageRatingForMovie(movie.getId()));
        return dto;
    }
}
