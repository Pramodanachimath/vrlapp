package com.vrlapp.model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Bus {

	private String source;
	@Id
	@GeneratedValue(generator = "bus_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "bus_gen",sequenceName = "bus_sequence",initialValue = 1,allocationSize = 1)
	private Integer busId;
	private String destination;
	private String time;
	
	@OneToMany
	Set<Passenger> passengers;
	
	@ManyToMany
	Set<Driver> drivers;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String source, String destination, String time) {
		super();
		this.source = source;
		this.destination = destination;
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Set<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(Set<Driver> drivers) {
		this.drivers = drivers;
	}

	@Override
	public String toString() {
		return "Bus [source=" + source + ", destination=" + destination + ", time=" + time + "]";
	}
	
	
}
