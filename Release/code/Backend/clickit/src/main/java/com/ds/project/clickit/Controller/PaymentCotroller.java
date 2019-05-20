package com.ds.project.clickit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.project.clickit.Entity.Payment;
import com.ds.project.clickit.Entity.Ticket;
import com.ds.project.clickit.Service.PaymentService;

@RestController
@RequestMapping(path="/pyment")
public class PaymentCotroller {
	
	@Autowired
	PaymentService service = new PaymentService();
	
	@PostMapping(path="/pay")
	public void addPayment(@RequestBody Payment payment/* ,@RequestBody Ticket ticket */) {
		service.setPayment(payment);
	}
}
