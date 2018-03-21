package com.mimararslan;

public class C {
	private String name;
	private int sayi;
	private B b;
	public C(B b) {
		super();
		this.b = b;
	}
	public C(String name, int sayi, B b) {
		System.out.println("C sınıfına ait hazırlayıcı methotdur.");
		this.name = name;
		this.sayi = sayi;
		this.b = b;
		System.out.println("name : "+name+" - - - sayi : "+sayi);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSayi() {
		return sayi;
	}
	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
	public void sonucugosterC(){
		System.out.println("C sınıfına ait methotdur.");
		b.sonucugosterB();
	}
	
	
}
