package com.capgemini.quiz.day4;

public class Quiz4 {

	public void myMethod()   
    {  
    System.out.println("Method");  
    }  
      
    {  
    System.out.println(" Instance Block");  
    }  
          
    public void my()  
    {  
    System.out.println("Constructor ");  
    }  
    static {  
        System.out.println("static block");  
    }  
    public static void main(String[] args) {  
    Quiz4 c = new Quiz4();  
    c.my();  
    c.myMethod();  
  }  


	}


