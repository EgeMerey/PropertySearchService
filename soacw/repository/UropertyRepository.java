package com.inm381.app.soacw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inm381.app.soacw.domain.Uroperty;

@Repository
public interface UropertyRepository extends JpaRepository <Uroperty, Long>{

	@Query (value = "SELECT * FROM Uroperty WHERE USER_ID = ?1", nativeQuery = true) 
	public List <Uroperty> deletebyUser(long userId);
	
	
	@Query (value = "SELECT * FROM Uroperty WHERE USER_ID = ?1", nativeQuery = true)
	public List <Uroperty> finduropertybyid(long userid);
		
}
