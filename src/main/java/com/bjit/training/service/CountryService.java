package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Country;
import com.bjit.training.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Country> getAll(){
		return countryRepository.findAll();
	}
	
	public Country getOne(int id) {
		return countryRepository.findOne(id);
	}
	
	public void save(Country country){
		countryRepository.save(country);
	}
	
	public void delete(int id){
		countryRepository.delete(id);
	}

}
