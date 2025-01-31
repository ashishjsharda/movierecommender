package org.ashish.movierecommender.service;

import org.ashish.movierecommender.dto.RatingDTO;
import org.ashish.movierecommender.model.Rating;
import org.ashish.movierecommender.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public void addRating(RatingDTO ratingDTO) {
        Rating rating = new Rating();
        // Set rating properties from DTO
        ratingRepository.save(rating);
    }

}
