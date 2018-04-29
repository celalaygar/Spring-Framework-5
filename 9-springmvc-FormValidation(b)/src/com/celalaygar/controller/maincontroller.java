package com.celalaygar.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.celalaygar.entity.Personel;

@Controller
public class maincontroller {

	
	//Blank Control Function
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor stringTrimerEditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimerEditor);
	}
	
	
	@RequestMapping("/")
	public String main() {

		return "main";
	}

	@RequestMapping("/showPersonelForm")
	public String showStudentForm(Model theModel) {

		Personel personel = new Personel();
		theModel.addAttribute("personel", personel);
		return "PersonelForm";
	}

	@PostMapping("/savePersonel")
	public String savePersonel(@Valid @ModelAttribute("personel") Personel personel, BindingResult bindingResult,
			Model theModel) {

		if (bindingResult.hasErrors()) {
			return "PersonelForm";
		}else{
			theModel.addAttribute("personel", personel);
			return "PersonelSaveResult";
		}


	}

}
