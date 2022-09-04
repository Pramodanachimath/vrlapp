package com.vrlapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vrlapp.model.Bus;
@Repository
public interface IBusRepository extends JpaRepository<Bus, Integer>{
    
	@Query("from Bus where source=?1")
	public List<Bus> findBySource(String source);
	
	@Query("from Bus where destination=?1")
	public List<Bus> findByDestination(String destination);

	@Query("from Bus where time=?1")
	public List<Bus> findByTime(String time) ;

	@Query("from Bus s inner join s.drivers d where d.driverName=?1")
	public List<Bus> findByDrivers(String driverName);
	
//	@Query("from Hotel h inner join h.itemList  i where i.itemName=?1 or i.price<?2");
	
	@Query("update Bus set time=?1 where busId=?2")
	void updateBus(String time,int busId);
	
}
