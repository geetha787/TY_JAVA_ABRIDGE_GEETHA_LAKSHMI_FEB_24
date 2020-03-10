package com.capgemini.quiz.day5;
class B  
{ 
    public static String sing()  
    { 
        return "la"; 
    } 
} 
public class Quiz9 extends B {
	public static String sing()  
    { 
        return "fa"; 
    } 
    public static void main(String[] args)  
    { 
    	Quiz9 a = new Quiz9(); 
        B b = new Quiz9(); 
    System.out.println(a.sing() + " " + b.sing()); 
    } 
} 
//B b = new A(); b is object of type B, 
//and hence b.sing() refers to the method sing of class B 
//see run-time polymorphism
