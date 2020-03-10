package com.capgemini.quiz.day6;

public class Quiz5 {
	int a = 1; 
    int b = 2; 
  
    Quiz5 func(Quiz5 obj) 
    { 
    	Quiz5 obj3 = new Quiz5(); 
        obj3 = obj; 
        obj3.a = obj.a++ + ++obj.b; 
        obj.b = obj.b; 
        return obj3; 
    } 
  
    public static void main(String[] args) 
    { 
    	Quiz5 obj1 = new Quiz5(); 
    	Quiz5 obj2 = obj1.func(obj1); 
  
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b); 
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b); 
  
    } 
}
//obj1 and obj2 refer to same memory address.
