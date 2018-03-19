package com.celalaygar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

	@RequestMapping("/")
	public String mainPage(){
		System.out.println("anasayfa");
		return "main";
	}
	
}
