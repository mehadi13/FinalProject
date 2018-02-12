package com.bjit.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.training.model.Payment;
import com.bjit.training.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public List<Payment> getAll(){
		return paymentRepository.findAll();
	}
	
	public Payment getOne(int id) {
		return paymentRepository.findOne(id);
	}
	
	public void save(Payment payment){
		paymentRepository.save(payment);
	}
	
	public void delete(int id){
		paymentRepository.delete(id);
	}

}
