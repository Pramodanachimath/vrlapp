package com.vrlapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Driver {
	private String driverName;
	@Id
	@GeneratedValue(generator = "driver_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "driver_gen",sequenceName = "driver_sequence",initialValue = 50,allocationSize = 1)
	private Integer driverId;
	private String city;
	private long phoneNo;
	private double salary;

	@OneToOne
	Bus bus;
	
	@OneToMany
	Set<Passenger> passengers;

	public Driver() {
		super();
	}

	public Driver(String driverName, String city, long phoneNo, double salary) {
		super();
		this.driverName = driverName;
		this.city = city;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", city=" + city + ", phoneNo=" + phoneNo + ", salary=" + salary
				+ "]";
	}
	
	
}
