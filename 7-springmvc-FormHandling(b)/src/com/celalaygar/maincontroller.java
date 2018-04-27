package com.celalaygar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@RequestMapping("/showPersonelForm")
	public String showStudentForm(Model theModel) {

		Personel personel = new Personel();
		
		//default checked phoneModel
		personel.setPhoneModel((new String []{"Samsung","Ýphone"}));
		personel.setGender("M");
		theModel.addAttribute("personel", personel);
		return "PersonelForm";
	}

	@PostMapping("/savePersonel")
	public String savePersonel(@ModelAttribute("personel") Personel personel, Model theModel,
			HttpServletRequest request) {
		theModel.addAttribute("personel", personel);
		theModel.addAttribute("phoneModel", personel.getPhoneModel());
		theModel.addAttribute("country", personel.getCountry());
		theModel.addAttribute("skills", personel.getSkills());
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
    @ModelAttribute("countryList")
    public Map<String, String> getCountryList() {
       Map<String, String> countryList = new HashMap<String, String>();
       countryList.put("US", "AMERÝKA");
       countryList.put("DE", "ALMANYA");
       countryList.put("IT", "ÝTALYA");
       countryList.put("QA", "KATAR");
       countryList.put("CH", "ÇÝN");
       countryList.put("SG", "SÝNGAPUR");
       countryList.put("TR", "TÜRKÝYE");
       countryList.put("MY", "MALEZYA");
       return countryList;
    }
    @ModelAttribute("avarageAgeList")
    public List<String> getAvarageAgeList() {
    	List<String> avarageAgeList = new ArrayList<String>();
    	avarageAgeList.add("10-19");
    	avarageAgeList.add( "20-29");
    	avarageAgeList.add("30-39");
    	avarageAgeList.add("40-49");
        return avarageAgeList;
    }
    @ModelAttribute("skillsList")
    public Map<String, String> getSkillsList() {
       Map<String, String> skillList = new HashMap<String, String>();
       skillList.put("JAVA", "JAVA");
       skillList.put("C#", "C#");
       skillList.put("PHP", "PHP");
       skillList.put("PYTHON", "PYTHON");
       skillList.put("C++", "C++");
       return skillList;
    }
}
