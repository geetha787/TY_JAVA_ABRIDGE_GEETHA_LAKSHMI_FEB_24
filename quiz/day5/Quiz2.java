package com.capgemini.quiz.day5;
class Base 
{ 
    public static String s = " Super Class "; 
    public Base() 
    { 
        System.out.printf("1"); 
    } 
} 
public class Quiz2 extends Base {
	 public Quiz2() 
	    { 
		 super();
	        System.out.printf("2"); 
	        //super(); 
//Constructor call to super class must be the first statement 
//in the constructor of the Derived class.
	    } 
	      
	    public static void main(String[] args) 
	    { 
	    	Quiz2 obj = new Quiz2(); 
	        System.out.printf(s); 
	    } 
}
