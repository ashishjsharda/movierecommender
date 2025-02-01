package org.ashish.movierecommender.service;

import org.ashish.movierecommender.dto.MovieDTO;
import org.ashish.movierecommender.dto.RecommendationDTO;
import org.ashish.movierecommender.model.Rating;
import org.ashish.movierecommender.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private MovieService movieService;

    public RecommendationDTO getRecommendations(Long userId) {
        // Get user's ratings
        List<Rating> userRatings = ratingRepository.findByUserId(userId);

        // Calculate recommendations based on user's preferences
        // This is a simple implementation - you might want to use more sophisticated algorithms
        Set<String> userPreferredGenres = userRatings.stream()
                .map(rating -> rating.getMovie().getGenre())
                .collect(Collectors.toSet());

        List<MovieDTO> recommendations = movieService.getAllMovies().stream()
                .filter(movie -> userPreferredGenres.contains(movie.getGenre()))
                .sorted(Comparator.comparing(MovieDTO::getAverageRating).reversed())
                .limit(10)
                .collect(Collectors.toList());

        RecommendationDTO recommendationDTO = new RecommendationDTO();
        recommendationDTO.setUserId(userId);
        recommendationDTO.setRecommendedMovies(recommendations);

        return recommendationDTO;
    }
}

