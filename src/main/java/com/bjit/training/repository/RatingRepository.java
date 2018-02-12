package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>  {

}
