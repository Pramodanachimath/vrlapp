package com.vrlapp.service;

import java.util.List;

import com.vrlapp.model.Driver;

public interface IDriverService {

	Driver addDriver(Driver driver);
	void updateDriver(Driver driver);
	void deleteDriver(int driverId);
	
	Driver getByDriverId(int driverId);
	List<Driver> getAll();
	
	List<Driver> getByDriverName(String driverName);
	List<Driver> getByCity(String city);
	List<Driver> getBySalary(double salary);
	List<Driver> getByName(String name);
	List<Driver> getBySource(String source);
	List<Driver> getByDestination(String destination);
	List<Driver> getByTime(String time);
	
	void updateDriver(double salary,int driverId);
}
