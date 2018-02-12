package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>  {

}
