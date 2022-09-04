package com.vrlapp.service;

import java.util.List;

import com.vrlapp.model.Passenger;

public interface IPassengerService {

	Passenger addDriver(Passenger passenger);
	void updateDriver(Passenger passenger);
	void deleteDriver(int passengerId);
	
	Passenger getByDriverId(int passengerId);
	List<Passenger> getAll();
	List<Passenger> getByname(String name);
	List<Passenger> getByAge(int age);
	List<Passenger> getBymobileNo(long mobileNo);
//	List<Passenger> getByBusName(String BusName);
	List<Passenger> getBySource(String source);
	List<Passenger> getByDestination(String destination);
 
	void updatePassagenger(int age,int passengerId);
}
