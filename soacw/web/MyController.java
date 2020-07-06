package com.inm381.app.soacw.web;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inm381.app.soacw.domain.Property;
import com.inm381.app.soacw.domain.Uroperty;
import com.inm381.app.soacw.domain.Usan;
import com.inm381.app.soacw.mainservices.MainService;

@Controller
public class MyController {
@Qualifier("mainService")
@Autowired
private MainService mainserv;

	@GetMapping("/")
	public String index() {
		
		return "login";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/loan")
	public String loan(Model model) {
//		long userId = 2;
//		List <Property> proplist = mainserv.getpsers().getAllPropertys();
//		for (Property i: proplist) {
//			System.out.println("----___----" + i);
//		}
//		//List <Usan> usa = mainserv.getlapps().getUsanInstance().getAllUsans();
//		//List <Usan> usa = mainserv
//		//model.addAttribute("data", mainserv.getlbors().getLoanEligibility(propPrice, Cscore));
//	    //System.out.println(mainserv.getpstos().saveSearches(userId, proplist));
//		mainserv.getpstos().saveSearches(userId, proplist);	
		Uroperty u = mainserv.getpstos().getUroperty(new Long(1));
		long userId = 2;
		double payment = 99.12;
		mainserv.getpoms().makeOffer(u, payment);
		return "home";
	}																																																																											

	
	
}
