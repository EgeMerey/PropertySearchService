package com.inm381.app.soacw.repository;

import com.inm381.app.soacw.domain.Offer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
	
	@Query (value = "SELECT * FROM OFFER WHERE UROPERTY_ID = ?1 AND OFFER = ?2", nativeQuery = true)
	public Offer exists (long id , double amount);
	
	
}
