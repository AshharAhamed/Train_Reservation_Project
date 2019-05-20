package com.ds.project.clickit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ticket")
public class Ticket {
	@Id
	@Column(name = "ticket_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_id ;

	
	
//	@Column(name = "train_id"/* ,insertable=false, updatable=false */ ) 
	private int train_id;
	 
	 
//	@Column(name = "user_id" /* ,insertable=false, updatable=false */)
    private int user_id;
    
//    @Column(name = "amount")
    private float amount;
    
//    @Column(name = "arrival_time")
    private String arrival_time;

//    @Column(name = "depature_time")
    private String depature_time;

//    @Column(name = "no_of_ticket")
    private int no_of_ticket;
    
//    @Column(name = "message")
    private String message;
    
//    @Column(name = "tclass")
    private int tclass;
    
    private int paid;
    
    
	
	@ManyToOne
	@JoinColumn(name = "train_id", nullable = false ,insertable=false, updatable=false)
	private Train train;
	 
    
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="user_id", nullable=false) private User user;
	 */
    
    

	/*
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */

	public Ticket() {
		
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDepature_time() {
		return depature_time;
	}

	public void setDepature_time(String depature_time) {
		this.depature_time = depature_time;
	}

	public int getNo_of_ticket() {
		return no_of_ticket;
	}

	public void setNo_of_ticket(int no_of_ticket) {
		this.no_of_ticket = no_of_ticket;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTclass() {
		return tclass;
	}

	public void setTclass(int tclass) {
		this.tclass = tclass;
	}
	
	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}
	 

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	
}
