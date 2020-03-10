package com.capgemini.quiz.day5;
class Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Grandparent's Print()");  
    }  
} 
  
class Parent extends Grandparent  
{ 
    public void Print()  
    { 
        System.out.println("Parent's Print()");  
    }  
} 
  
class Child extends Parent  
{ 
    public void Print()    
    { 
    	super.Print();
        //super.super.Print(); --compilation error
        System.out.println("Child's Print()");  
    }  
} 
  

public class Quiz7 {
	public static void main(String[] args)  
    { 
        Child c = new Child(); 
        c.Print();  
    } 
}
// In Java, it is not allowed to do super.super.
// We can only access Grandparent’s members using Parent.