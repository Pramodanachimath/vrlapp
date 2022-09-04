package com.vrlapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrlapp.model.Passenger;
import com.vrlapp.repository.IPassengerRepository;
@Service
public class PassengerServiceImpl implements IPassengerService {

	@Autowired
	IPassengerRepository passengerRepository;

	@Override
	public Passenger addDriver(Passenger passenger) {
		// TODO Auto-generated method stub
		return passengerRepository.save(passenger);
	}

	@Override
	public void updateDriver(Passenger passenger) {
		passengerRepository.save(passenger);
	}

	@Override
	public void deleteDriver(int passengerId) {
		passengerRepository.deleteById(passengerId);
	}

	@Override
	public Passenger getByDriverId(int passengerId) {
		return passengerRepository.findById(passengerId).get();
	}

	@Override
	public List<Passenger> getAll() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}

	@Override
	public List<Passenger> getByname(String name) {
		// TODO Auto-generated method stub
		return passengerRepository.findByname(name);
	}

	@Override
	public List<Passenger> getByAge(int age) {
		// TODO Auto-generated method stub
		return passengerRepository.findByAge(age);
	}

	@Override
	public List<Passenger> getBymobileNo(long mobileNo) {
		// TODO Auto-generated method stub
		return passengerRepository.findBymobileNo(mobileNo);
	}

//	@Override
//	public List<Passenger> getByBusName(String BusName) {
//		// TODO Auto-generated method stub
//		return passengerRepository.findByBusName(BusName);
//	}

	@Override
	public List<Passenger> getBySource(String source) {
		// TODO Auto-generated method stub
		return passengerRepository.findBySource(source);
	}

	@Override
	public List<Passenger> getByDestination(String destination) {
		// TODO Auto-generated method stub
		return passengerRepository.findByDestination(destination);
	}

	@Override
	public void updatePassagenger(int age, int passengerId) {
		passengerRepository.updatePassagenger(age, passengerId);
	}

}