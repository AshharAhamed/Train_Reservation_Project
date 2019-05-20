package com.ds.project.clickit.Entity;

//import lombok.*;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@Table(name="place")
@SelectBeforeUpdate
public class Place {
	@Id
	@Column(name = "place_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@Column(name = "name")
	private String name;
	
	
	  @ManyToMany(mappedBy = "places") 
	  private Set<Train> train = new HashSet<>();


	  
	  
	public Place() {
		
	}


	public int getPlace_id() {
		return id;
	}


	public void setPlace_id(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Train> getTrain() {
		return train;
	}


	public void setTrain(Set<Train> train) {
		this.train = train;
	}
	  
	  
	 
}
