package com.inm381.app.soacw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inm381.app.soacw.domain.Usan;


@Repository
public interface UsanRepository extends JpaRepository <Usan, Long>{

}
