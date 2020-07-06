package com.inm381.app.soacw.repository;

import com.inm381.app.soacw.domain.CardPayment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardPaymentRepository extends JpaRepository<CardPayment, Long> {
}
