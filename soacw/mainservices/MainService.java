package com.inm381.app.soacw.mainservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

@Autowired
private PserS psers;
@Autowired
private PstoS pstos;
@Autowired
private PomS poms;
@Autowired
private LbroS lbors;
@Autowired
private LappS lapps;
@Autowired
private CpayS cpays;

	public PserS getpsers() {
		return psers;
	}
	
	public PstoS getpstos() {
		return pstos;
	}
	
	public PomS getpoms() {
		return poms;
	}
	
	public LbroS getlbors() {
		return lbors;
	}
	
	public LappS getlapps() {
		return lapps;
	}
	
	public CpayS getcpays() {
		return cpays;
	}
	
	
	
}
