package com.capgemini.interfacei;

public class AutoMobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bmw b1=new Bmw();
b1.gear();	
b1.gps();
System.out.println("______________");
Toyota t=new Toyota();
t.gear();
t.gps();
b1.abs();
System.out.println("______________");

Audi a1= new Audi();
a1.abs();
a1.gear();
a1.gps();

	}

}
