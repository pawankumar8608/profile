package com.profile.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {
	
	@RequestMapping(value={"/", "/index"}, method=RequestMethod.GET)
	public String homePage(){
		
		  return "index";
	}
	
	

}
