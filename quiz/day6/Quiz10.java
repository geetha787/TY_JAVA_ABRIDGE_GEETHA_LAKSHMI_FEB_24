package com.capgemini.quiz.day6;
class Demo1 
{ 
    int a, b; 
      
    Demo1() 
    { 
        a = 10; 
        b = 20; 
    } 
      
    public void print() 
    { 
        System.out.println ("a = " + a + " b = " + b + "\n"); 
    } 
} 
  
public class Quiz10 {
	 public static void main(String[] args) 
	    { 
	        Demo1 obj1 = new Demo1(); 
	        Demo1 obj2 = obj1; 
	  
	        obj1.a += 1; 
	        obj1.b += 1; 
	  
	        System.out.println ("values of obj1 : "); 
	        obj1.print(); 
	        System.out.println ("values of obj2 : "); 
	        obj2.print(); 
	  
	    } 
}
//Assignment of obj2 to obj1 makes obj2 a reference to obj1. 
//Therefore, any change in obj1 will be reflected in obj2 also.
