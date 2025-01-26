package org.ashish.movierecommender.repository;

import org.ashish.movierecommender.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContaining(String title);
    List<Movie> findByGenreContaining(String genre);
    List<Movie> findByDirectorContaining(String director);
    List<Movie> findByReleaseYear(Integer releaseYear);
    List<Movie> findByAverageRating(Double averageRating);
    List<Movie> findByGenre(String genre);
    @Query("SELECT m FROM Movie m WHERE m.releaseYear = :year")
    List<Movie> findByYear(@Param("year") Integer year);
}


