package com.celalaygar.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.celalaygar.entity.Personel;

public class PersonelValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Personel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
	      ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
	    	         "id", "valid.id","id girilmeli");
	      ValidationUtils.rejectIfEmptyOrWhitespace(errors, 
	    	         "name", "valid.name","name girilmeli");
		
	}

}
