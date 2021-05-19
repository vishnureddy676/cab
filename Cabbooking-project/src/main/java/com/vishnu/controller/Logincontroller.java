package com.vishnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vishnu.db.Logindatabase;
import com.vishnu.db.Logindb;
import com.vishnu.dto.LoginDTO;

@Controller
public class Logincontroller {
	@GetMapping("/")
	public String showstudentList() {
		
		return "home-page";
		
	}
	
	@RequestMapping("/sucess")
	public String regstudentList(LoginDTO loginDTO) {
		
		Object[] vis= {loginDTO.getUname(),
		loginDTO.getPsw(),loginDTO.getCountry(),loginDTO.getMobile()};
		
		
		Logindatabase logindatabase =new Logindatabase();
		logindatabase.Insert(vis);
		
		
		
		return "sucess-page";
	}
	@RequestMapping("/link")
	public String showpage() {
		return "reg-page";
	}
	

}
