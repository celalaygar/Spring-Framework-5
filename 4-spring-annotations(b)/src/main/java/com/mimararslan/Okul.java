package com.mimararslan;

import org.springframework.beans.factory.annotation.Autowired;

public class Okul {
	private String okulIsmi;
	
	@Autowired
	private Adres adres;

	public Okul() {

		System.out.println("okul sınıfına ait hazırlayıcı methotdur.");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public void adresBilgileri(){
		System.out.println("adres bilgileri : "+adres.getIl()+" "+adres.getIlce());
	}

	
}
