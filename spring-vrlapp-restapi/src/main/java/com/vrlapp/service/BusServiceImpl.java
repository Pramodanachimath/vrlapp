package com.vrlapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrlapp.model.Bus;
import com.vrlapp.repository.IBusRepository;
@Service
public class BusServiceImpl implements IBusService {

	@Autowired
	IBusRepository busRepository;
	
	@Override
	public Bus addBus(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.save(bus);
	}

	@Override
	public void updateBus(Bus bus) {
		busRepository.save(bus);

	}

	@Override
	public void deleteBus(int busId) {
      busRepository.deleteById(busId);
	}

	@Override
	public Bus getByBusId(int busId) {
		// TODO Auto-generated method stub
		return busRepository.findById(busId).get();
	}

	@Override
	public List<Bus> getAllBus() {
		// TODO Auto-generated method stub
		return busRepository.findAll();
	}

	@Override
	public List<Bus> getBySource(String source) {
		// TODO Auto-generated method stub
		return busRepository.findBySource(source);
	}

	@Override
	public List<Bus> getByDestination(String destination) {
		// TODO Auto-generated method stub
		return busRepository.findByDestination(destination);
	}

	@Override
	public List<Bus> getByTime(String time) {
		// TODO Auto-generated method stub
		return busRepository.findByTime(time);
	}

	@Override
	public List<Bus> getByDrivers(String driverName) {
		// TODO Auto-generated method stub
		return busRepository.findByDrivers(driverName);
	}

	@Override
	public void updateBus(String time, int busId) {
    busRepository.updateBus(time, busId);		
	}

}
