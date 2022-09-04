package com.vrlapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Passenger {

	private String name;
	@Id
	@GeneratedValue(generator = "passenger_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "passenger_gen",sequenceName = "passenger_sequence",initialValue = 100,allocationSize = 1)
	private Integer passengerId;
	private int age;
	private String email;
	private long mobileNo;
	
	@ManyToMany
	Set<Bus> bus;
	
	@ManyToOne
	Driver driver;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String name, int age, String email, long mobileNo) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Set<Bus> getBus() {
		return bus;
	}

	public void setBus(Set<Bus> bus) {
		this.bus = bus;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", email=" + email + ", mobileNo=" + mobileNo + "]";
	}
	
	
}
