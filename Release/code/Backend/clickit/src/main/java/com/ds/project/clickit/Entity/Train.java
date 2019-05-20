package com.ds.project.clickit.Entity;

//import lombok.*;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

//@Data
//@EqualsAndHashCode(exclude = "places")

@Entity(name = "train")
public class Train {
	@Id
	@Column(name = "train_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long train_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "monday")
	private int monday;
	
	@Column(name = "tuesday")
	private int tuesday;
	
	@Column(name = "wednesday")
	private int wednesday;
	
	@Column(name = "thurseday")
	private int thurseday;
	
	@Column(name = "friday")
	private int friday;
	
	@Column(name = "saturday")
	private int saturday;
	
	@Column(name = "sunday")
	private int sunday;
	
	@Column(name = "class_1")
	private float class_1;

	@Column(name = "class_2")
	private float class_2;

	@Column(name = "class_3")
	private float class_3;
	
	@Column(name = "tfrom")
	private String from;
	
	@Column(name = "tto")
	private String to;
	
	@Column(name = "arrival_time")
	private String arrival_time;
	
	@Column(name = "depature_time")
	private String depature_time;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	  @JoinTable( name = "train_place",
	  	joinColumns = @JoinColumn(name = "train_id", referencedColumnName = "train_id"),
	  	inverseJoinColumns = @JoinColumn(name = "place_id", referencedColumnName = "place_id")) 
	 private Set<Place> places;
	 
	/*
	 * @OneToMany(mappedBy = "train", cascade = CascadeType.ALL) private Set<Ticket>
	 * tickets;
	 */
	 

	public Train() {
		super();

	}

	public Long getTrainId() {
		return train_id;
	}

	public void setTrainId(Long train_id) {
		this.train_id = train_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonday() {
		return monday;
	}

	public void setMonday(int monday) {
		this.monday = monday;
	}

	public int getTuesday() {
		return tuesday;
	}

	public void setTuesday(int tuesday) {
		this.tuesday = tuesday;
	}

	public int getWednesday() {
		return wednesday;
	}

	public void setWednesday(int wednesday) {
		this.wednesday = wednesday;
	}

	public int getThurseday() {
		return thurseday;
	}

	public void setThurseday(int thurseday) {
		this.thurseday = thurseday;
	}

	public int getFriday() {
		return friday;
	}

	public void setFriday(int friday) {
		this.friday = friday;
	}

	public int getSaturday() {
		return saturday;
	}

	public void setSaturday(int saturday) {
		this.saturday = saturday;
	}

	public int getSunday() {
		return sunday;
	}

	public void setSunday(int sunday) {
		this.sunday = sunday;
	}

	public float getClass_1() {
		return class_1;
	}

	public void setClass_1(float class_1) {
		this.class_1 = class_1;
	}

	public float getClass_2() {
		return class_2;
	}

	public void setClass_2(float class_2) {
		this.class_2 = class_2;
	}

	public float getClass_3() {
		return class_3;
	}

	public void setClass_3(float class_3) {
		this.class_3 = class_3;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getArrivalTime() {
		return arrival_time;
	}

	public void setArrivalTime(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDepatureTime() {
		return depature_time;
	}

	public void setDepatureTime(String depature_time) {
		this.depature_time = depature_time;
	}

	public Set<Place> getPlaces() {
		return places;
	}

	public void setPlaces(Set<Place> places) {
		this.places = places;
	}
	
	

}
