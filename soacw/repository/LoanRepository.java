package com.inm381.app.soacw.repository;

import com.inm381.app.soacw.domain.Loan;
import com.inm381.app.soacw.domain.Property;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
	
	@Query (value = "SELECT * FROM Loan WHERE Amount = ?1", nativeQuery = true)
	public List <Loan> searchByAmount (Float a);
	@Query (value = "SELECT * FROM Loan WHERE Eligibility LIKE ?1", nativeQuery = true)
	public List <Loan> searchByEligibility (Float a);
	@Query (value = "SELECT * FROM Loan WHERE AMOUNT < ?1 AND ELIGIBILITY < ?2", nativeQuery = true)
	public List <Loan> getLoanEligibility (Float propPrice, Float Cscore);
	
}
