package com.mimararslan;

public class B {

	private A a;
	
	public B(A a){
		System.out.println("B sınıfına ait hazırlayıcı methotdur.");
		this.a=a;
	}
	
	public void sonucugosterB(){
		System.out.println("B sınıfına ait methotdur.");
		this.a.sonucugosterA();
	}
	
}
