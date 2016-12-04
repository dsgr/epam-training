package com.epam.training.dataaccess.dao;

import java.util.List;

import com.epam.training.dataaccess.model.Payment;

public interface PaymentDao {

	Long insert(Payment payment);
	Payment getById(Long id);
	List<Payment> getUserPayments(Long userId);
	
	
	
}
