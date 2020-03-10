package com.capgemini.abstarction;

public class Sbi implements Atm {

	@Override
	public void validateCard() {
		System.out.println("sbi validate card");
	}

	@Override
	public void getInfo() {
		System.out.println("sbi getinfo");
	}

}
