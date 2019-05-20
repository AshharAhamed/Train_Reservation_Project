package com.ds.project.clickit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.project.clickit.Entity.Payment;
import com.ds.project.clickit.Repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	UserService userService = new UserService();
	
	
	public String setPayment(Payment payment) {
		
		if(payment.getPayment_methode()==0) {
//			this is card payment
//			if(userService.getUserById(payment.get))
		}else if(payment.getPayment_methode()==1) {
//			this is for dialog mbile payment
		}
		paymentRepository.save(payment);
		
		return "Paid Success";
	}
}
