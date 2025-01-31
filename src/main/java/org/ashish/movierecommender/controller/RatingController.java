package org.ashish.movierecommender.controller;

import org.ashish.movierecommender.dto.RatingDTO;
import org.ashish.movierecommender.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Void> addRating(@RequestBody RatingDTO ratingDTO) {
        ratingService.addRating(ratingDTO);
        return ResponseEntity.ok().build();
    }
}
