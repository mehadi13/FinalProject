package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>  {

}
