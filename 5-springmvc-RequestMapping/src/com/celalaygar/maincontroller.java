package com.celalaygar;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class maincontroller {

	@RequestMapping("/")
	public String main() {

		return "main";
	}

	@RequestMapping("/search")
	public String search() {

		return "search";
	}

	// http://localhost:8081/springmvc-RequestMapping/general/5/10/2011
	@RequestMapping("/general-1/{day}/{month}/{year}")
	public String general1(@PathVariable("day") int day, @PathVariable("month") int month,
			@PathVariable("year") int year, Model model) {
		LocalDate date = LocalDate.of(year, month, day);
		model.addAttribute("mesaj1", " - - - Girilen tarih - - - ");
		model.addAttribute("mesaj2", "Tarih : " + date);
		return "general-1";
	}

	// http://localhost:8081/springmvc-RequestMapping/general-2?name=celal&surname=aygar
	@RequestMapping("/general-2-1")
	public String general2_1(@RequestParam("name") String name, @RequestParam("surname") String surname, Model model) {
		model.addAttribute("mesaj1", " - - - Girilen Ýsim - - - ");
		model.addAttribute("mesaj2", "Ýsim : " + name + " " + surname);
		return "general-2";
	}
	// http://localhost:8081/springmvc-RequestMapping/general-2?name=celal&surname=aygar&phoneNumber=05551112233
	@RequestMapping("/general-2-2")
	public String general2_2(@RequestParam("name") String name,
			@RequestParam("surname") String surname, 
			@RequestParam("phoneNumber") String phoneNumber,
			Model model) {
		model.addAttribute("mesaj1", " - - - Girilen Ýsim - - - ");
		model.addAttribute("mesaj2", "Ýsim : " + name + " " + surname+" "+phoneNumber);
		return "general-2";
	}
	



}
