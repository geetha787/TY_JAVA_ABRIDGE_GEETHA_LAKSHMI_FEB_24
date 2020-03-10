package com.capgemini.quiz.day6;

public class Quiz6 {
	public static void main(String args[]) {  
	       String x = null;  
	       giveMeAString(x);  
	       System.out.println(x);  
	    }  
	    static void giveMeAString(String y)  
	    {  
	       y = "GeeksQuiz";  
	    }  
}
//Parameters in Java is passed by value. 
//So the changes made to y do not reflect in main().