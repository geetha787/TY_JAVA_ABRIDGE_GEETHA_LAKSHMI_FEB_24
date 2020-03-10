package com.capgemini.accessmodifiers.package2;
import com.capgemini.accessmodifiers.package1.*;
public class Demo extends Sample {
public static void main(String[] args) {
	Sample s=new Sample();
	
//*private members can be accessed inside same class
//	System.out.println(s.a);
//	s.add();
//*
	
	System.out.println("_________");
	
//*default members can not be accessed in diff package
///	s.subract();
//	System.out.println(s.b);
	
	

	System.out.println(s.s);
	s.divide();// we can access public members in diff cls diff package
	System.out.println("_________");
	
	
	
//* protected members can not be accessed directly , we have to import and extend the super cls
//we have to create a object of sub class then we have to access protected members
	Demo d1=new Demo();
	System.out.println(d1.c);	
    d1.multiply();

}

}
