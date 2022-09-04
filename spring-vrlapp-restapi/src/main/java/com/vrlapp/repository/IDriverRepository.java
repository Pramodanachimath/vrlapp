package com.vrlapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vrlapp.model.Driver;
@Repository
public interface IDriverRepository extends JpaRepository<Driver, Integer>{

	@Query("from Driver where driverName=?1")
	public List<Driver> findByDriverName(String driverName) ;
	
	@Query("from Driver where city=?1")
	public List<Driver> findByCity(String city);
	
	@Query("from Driver where salary=?1")
	public List<Driver> findBySalary(double salary) ;
	
	@Query("from Driver d inner join d.passengers p where p.name=?1")
	public List<Driver> findByName(String name) ;

	@Query("from Driver d inner join d.bus b where b.source=?1")
	public List<Driver> findBySource(String source) ;

	@Query("from Driver d inner join d.bus b where b.destination=?1")
	public List<Driver> findByDestination(String destination) ;
	
	@Query("from Driver d inner join d.bus b where b.time=?1")
	public List<Driver> findByTime(String time);
	
	@Query("update Driver set salary=?1 where driverId=?2")
	public void updateDriver(double salary, int driverId) ;
//	@Query("update passenger set name=?1 where passengerId=?2")
}
