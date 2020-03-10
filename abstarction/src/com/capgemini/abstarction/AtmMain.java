package com.capgemini.abstarction;

public class AtmMain {

	public static void main(String[] args) {
    Hdfc h=new Hdfc();
    Icici i=new Icici();
    Sbi s=new Sbi();
    Machine m=new Machine();
    m.slot(h);
    System.out.println("_______________");
    m.slot(i);
    System.out.println("_______________");
    m.slot(s);
	}

}
//if we want to add another bank we need not to change the whole code
//we need to create a cls which implements the Atm interface
//then we create a object of sbi and invoke the object