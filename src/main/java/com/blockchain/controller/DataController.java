package com.blockchain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@RequestMapping(value = "/arrived", method = RequestMethod.POST)
	public String arrived(@RequestParam String idUser){
		return idUser;
	}
	
	@RequestMapping(value = "/gone" , method = RequestMethod.POST)
	public String gone(@RequestParam String idUser){
		return idUser;		
	}

}
