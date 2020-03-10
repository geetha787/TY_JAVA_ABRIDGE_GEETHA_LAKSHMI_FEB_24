package com.capgemini.quiz.day5;

public class Quiz1 {
	public Quiz1() 
    { 
        System.out.printf("1"); 
        new Quiz1(10); 
        System.out.printf("5"); 
    } 
    public Quiz1(int temp) 
    { 
        System.out.printf("2"); 
        new Quiz1(10, 20); 
        System.out.printf("4"); 
    } 
    public Quiz1(int data, int temp) 
    { 
        System.out.printf("3"); 
          
    } 
      
    public static void main(String[] args) 
    { 
    	Quiz1 obj = new Quiz1(); 
          
    } 
      
}
