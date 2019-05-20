package com.ds.project.clickit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {

	@Id
	@Column(name="payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_id;
	private int ticket_id;
	private int payment_methode;
	private int phone_no;
	
	
	
	public Payment() {
		
	}



	public int getPayment_id() {
		return payment_id;
	}



	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}



	public int getTicket_id() {
		return ticket_id;
	}



	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}



	public int getPayment_methode() {
		return payment_methode;
	}



	public void setPayment_methode(int payment_methode) {
		this.payment_methode = payment_methode;
	}



	public int getPhone_no() {
		return phone_no;
	}



	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	
	
	
	
}
