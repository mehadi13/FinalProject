package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Rating;
import com.bjit.training.repository.RatingRepository;

@Service
public class RatingService {
	
	@Autowired
	RatingRepository ratingRepository;
	
	public List<Rating> getAll(){
		return ratingRepository.findAll();
	}
	
	public Rating getOne(int id) {
		return ratingRepository.findOne(id);
	}
	
	public void save(Rating rating){
		ratingRepository.save(rating);
	}
	
	public void delete(int id){
		ratingRepository.delete(id);
	}

}
