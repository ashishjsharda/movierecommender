package org.ashish.movierecommender.dto;

import java.util.List;

public class RecommendationDTO {
    private Long id;
    private Long userId;
    private Long movieId;
    private Integer rating;
    private String review;
    private List<MovieDTO> recommendedMovies;

    public RecommendationDTO() {
    }

    public RecommendationDTO(Long id, Long userId, Long movieId, Integer rating, String review) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public List<MovieDTO> getRecommendedMovies() {
        return recommendedMovies;
    }

    public void setRecommendedMovies(List<MovieDTO> recommendedMovies) {
        this.recommendedMovies = recommendedMovies;
    }
}
