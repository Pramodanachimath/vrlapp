package com.vrlapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrlapp.model.Driver;
import com.vrlapp.repository.IDriverRepository;
@Service
public class DriverServiceImpl implements IDriverService {

	@Autowired
	IDriverRepository driverRepository;

	@Override
	public Driver addDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepository.save(driver);
	}

	@Override
	public void updateDriver(Driver driver) {
		driverRepository.save(driver);

	}

	@Override
	public void deleteDriver(int driverId) {
		driverRepository.deleteById(driverId);
	}

	@Override
	public Driver getByDriverId(int driverId) {
		// TODO Auto-generated method stub
		return driverRepository.findById(driverId).get();
	}

	@Override
	public List<Driver> getAll() {
		// TODO Auto-generated method stub
		return driverRepository.findAll();
	}

	@Override
	public List<Driver> getByDriverName(String driverName) {
		// TODO Auto-generated method stub
		return driverRepository.findByDriverName(driverName);
	}

	@Override
	public List<Driver> getByCity(String city) {
		// TODO Auto-generated method stub
		return driverRepository.findByCity(city);
	}

	@Override
	public List<Driver> getBySalary(double salary) {
		// TODO Auto-generated method stub
		return driverRepository.findBySalary(salary);
	}

	@Override
	public List<Driver> getByName(String name) {
		// TODO Auto-generated method stub
		return driverRepository.findByName(name);
	}

	@Override
	public List<Driver> getBySource(String source) {
		// TODO Auto-generated method stub
		return driverRepository.findBySource(source);
	}

	@Override
	public List<Driver> getByDestination(String destination) {
		// TODO Auto-generated method stub
		return driverRepository.findByDestination(destination);
	}

	@Override
	public List<Driver> getByTime(String time) {
		// TODO Auto-generated method stub
		return driverRepository.findByTime(time);
	}

	@Override
	public void updateDriver(double salary, int driverId) {
		driverRepository.updateDriver(salary, driverId);
	}

}
