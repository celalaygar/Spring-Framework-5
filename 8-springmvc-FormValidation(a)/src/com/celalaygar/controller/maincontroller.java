package com.celalaygar.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	@Autowired
	@Qualifier("personelValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
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
	public String savePersonel(@ModelAttribute("personel") @Validated Personel personel, BindingResult bindingResult,
			Model theModel, HttpServletRequest request) {

		if (bindingResult.hasErrors()) {
			return "PersonelForm";
		}

		theModel.addAttribute("personel", personel);
		return "PersonelSaveResult";
	}

}
