package com.capgemini.quiz.day2;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		a=3.0/0;
		b = 0/4.0;
		c=0/0.0;
		  
		System.out.println(a);
	    System.out.println(b);
	    
	    System.out.println(c);
	        } 
	}

//1.infinity  2.0.0    3.NaN    4. ALL THE ABOVE
//For floating point literals, we have constant value to represent (10/0.0) 
//infinity either positive or negative and also have NaN (not a number for undefined like 0/0.0), but for the integral type, we don’t have any constant that’s why we get an arithmetic exception.
