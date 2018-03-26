package com.mimararslan;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String isim,telNo;
	private int yas;
	
	@Autowired
	private Okul okul;
	
	public Student(){
		System.out.println("Student sınıfına ait hazırlayıcı methotdur.");
		
	}

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}


	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	public void okulBilgileri(){
		
		System.out.println("Okul ismi : "+okul.getOkulIsmi());
		okul.adresBilgileri();
	}
	
	public void init(){
		System.out.println("Student sınıfı init methodu.");
	}
	
	public void destroy(){
		System.out.println("Student sınıfı destroy methodu.");
	}
}
