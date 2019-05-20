package com.ds.project.clickit.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "user")
public class User {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "user_name")
    private String username;
    
    @Column(name = "fname")
    private String fname;
    
    @Column(name = "lname")
    private String lname;
    
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private int phone_number;

    @Column(name = "nic_no")
    private String nic_no;
    
	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private Set<Ticket>
	 * tickets;
	 */

    
	/*
	 * public Set<Ticket> getTickets() { return tickets; }
	 * 
	 * public void setTickets(Set<Ticket> tickets) { this.tickets = tickets; }
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getNic_no() {
		return nic_no;
	}

	public void setNic_no(String nic_no) {
		this.nic_no = nic_no;
	}
    
    
}
