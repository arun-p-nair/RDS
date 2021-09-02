package com.movies.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.ratingdataservice.model.Rating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		List<Rating> ratings = Arrays.asList(new Rating("10", 4), new Rating("11", 4), new Rating("12", 3));
		userRating.setUserRating(ratings);
		return userRating;
	}
}
