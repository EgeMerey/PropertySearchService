package com.inm381.app.soacw.mainservices;

import org.springframework.stereotype.Service;

import com.inm381.app.soacw.domain.Offer;
import com.inm381.app.soacw.domain.Uroperty;
import com.inm381.app.soacw.services.OfferService;


@Service
public class PomS extends OfferService{

	
	
	public Offer makeOffer (Uroperty u , double payment) {
		
		// if offer exists, then we do an update else we do a create.
		long usrid = u.getUserId();
		long propid = u.getPropertyId();
		
		Offer o = new Offer();
		o.setOffer(payment);
		o.setUroperty(u);
		
		createOffer(o);
		return o;
				
	}
	
	
}
