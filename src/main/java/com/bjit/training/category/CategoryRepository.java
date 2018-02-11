package com.bjit.training.category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer>  {

}
