package com.capgemini.quiz.day5;
class Derived  
{ 
    public void getDetails() 
    { 
        System.out.println("Derived class"); 
    } 
} 
public class Quiz8 extends Derived{
    public void getDetails() 

//protected void getDetails()----Compilation error due to access modifier
    { 
        System.out.println("Test class"); 
    } 
    public static void main(String[] args) 
    { 
        Derived obj = new Quiz8();  // line xyz 
        obj.getDetails(); 
    } 
}
//The overriding method can not have more restrictive access modifier.


