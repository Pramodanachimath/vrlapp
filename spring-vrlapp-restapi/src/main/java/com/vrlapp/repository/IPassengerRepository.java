package com.vrlapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vrlapp.model.Passenger;
@Repository
public interface IPassengerRepository extends JpaRepository<Passenger, Integer>{
	@Query("from Passenger where name=?1")
	public List<Passenger> findByname(String name) ;
	
	@Query("from Passenger where age=?1")
	public List<Passenger> findByAge(int age) ;
	
	@Query("from Passenger where mobileNo=?1")
	public List<Passenger> findBymobileNo(long mobileNo) ;
	
//	@Query("from Passenger p inner join p.bus b where b.busName=?1")
//	public List<Passenger> findByBusName(String BusName) ;
	
	@Query("from Passenger p inner join p.bus b where b.source=?1")
	public List<Passenger> findBySource(String source) ;
	
	@Query("from Passenger p inner join p.bus b where b.destination=?1")
	public List<Passenger> findByDestination(String destination) ;
	
	@Query("update passenger set age=?1 where passengerId=?2")
	public void updatePassagenger(int age, int passengerId) ;
	
}
