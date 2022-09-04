package com.vrlapp.service;

import java.util.List;

import com.vrlapp.model.Bus;

public interface IBusService {

	Bus addBus(Bus bus);
	void updateBus(Bus bus);
	void deleteBus(int busId);
	
	Bus getByBusId(int busId);
	List<Bus> getAllBus();
	
	List<Bus> getBySource(String source);
	List<Bus> getByDestination(String destination);
	List<Bus> getByTime(String time);
	List<Bus> getByDrivers(String driverName);
	
	void updateBus(String time,int busId);
}
