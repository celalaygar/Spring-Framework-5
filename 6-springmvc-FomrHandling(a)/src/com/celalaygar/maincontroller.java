package com.celalaygar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

	@RequestMapping("/")
	public String main() {

		return "main";
	}

	@RequestMapping("/search")
	public String search() {

		return "search";
	}

	@RequestMapping("/showPersonelForm")
	public String showStudentForm(Model theModel) {

		Personel personel = new Personel();
		personel.setPhoneModel((new String []{"Samsung","Ýphone","Sony"}));
		theModel.addAttribute("personel", personel);
		return "PersonelForm";
	}

	@PostMapping("/savePersonel")
	public String savePersonel(@ModelAttribute("personel") Personel personel, Model theModel,
			HttpServletRequest request) {
		theModel.addAttribute("email", personel.getEmail());
		theModel.addAttribute("personel", personel);
		theModel.addAttribute("phoneModel", personel.getPhoneModel());
		return "PersonelSaveResult";
	}
    @ModelAttribute("phoneList")
    public List<String> getWebFrameworkList() {
       List<String> phoneList = new ArrayList<String>();
       phoneList.add("Samsung");
	   phoneList.add("Ýphone");
	   phoneList.add("Sony");
	   phoneList.add("Nokia");
	   phoneList.add("Huawei");
       return phoneList;
    }
}
