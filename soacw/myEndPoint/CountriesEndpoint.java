package com.inm381.app.soacw.myEndPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.inm381.app.soacw.entity.*;
import com.inm381.app.soacw.mainservices.CpayS;
import com.inm381.app.soacw.mainservices.LappS;
import com.inm381.app.soacw.mainservices.LbroS;
import com.inm381.app.soacw.mainservices.PomS;
import com.inm381.app.soacw.mainservices.PserS;
import com.inm381.app.soacw.mainservices.PstoS;


@Endpoint
public class CountriesEndpoint {
 
    private static final String NAMESPACE_URI = "http://www.soacw.app.inm381.com/entity";
 
//    private CountriesRepository countriesRepository;
 
//    @Autowired
//    public CountriesEndpoint(CountriesRepository countriesRepository) {
//        this.countriesRepository = countriesRepository;
//    }
// 
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountriesRequest")
//    @ResponsePayload
//    public GetCountriesResponse getCountries(@RequestPayload GetCountriesRequest request) {
//        GetCountriesResponse response = new GetCountriesResponse();
//        response.setCountries(countriesRepository.findCountries(request.getName()));
// 
//        return response;
//    }
      
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


}
