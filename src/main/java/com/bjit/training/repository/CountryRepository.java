package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>  {

}
