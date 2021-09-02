package com.movies.ratingdataservice.resource;

import java.util.List;

import com.movies.ratingdataservice.model.Rating;

public class UserRating {

	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	
}
