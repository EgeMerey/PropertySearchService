package com.inm381.app.soacw.repository;

import com.inm381.app.soacw.domain.Property;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
	
	@Query (value = "SELECT * FROM PROPERTY WHERE BEDROOM = ?1", nativeQuery = true)
	public List <Property> searchByBedroom (int a);
	@Query (value = "SELECT * FROM PROPERTY WHERE Location LIKE %?1%", nativeQuery = true)
	public List <Property> searchByLocation (String a);
	@Query (value = "SELECT * FROM PROPERTY WHERE Condition LIKE %?1%", nativeQuery = true)
	public List <Property> searchByCondition (String a);
	@Query (value = "SELECT * FROM PROPERTY WHERE Price = ?1", nativeQuery = true)
	public List <Property> searchByPrice (Float a);
	@Query (value = "SELECT * FROM PROPERTY WHERE TYPE LIKE %?1%", nativeQuery = true)
	public List <Property> searchByType (String a);
	@Query (value = "SELECT * FROM PROPERTY WHERE FEATURES LIKE %?1%", nativeQuery = true)
	public List <Property> searchByFeatures (String a);
	@Query (value = "SELECT * FROM PROPERTY WHERE ID = ?1", nativeQuery = true)
	public Property searchById (Long a);
	
}
