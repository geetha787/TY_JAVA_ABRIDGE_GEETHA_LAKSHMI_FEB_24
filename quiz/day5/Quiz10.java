package com.capgemini.quiz.day5;
class Building  
{ 
    Building()  
    { 
        System.out.println("Geek-Buiding"); 
    } 
    Building(String name)  
    { 
        this(); 
        System.out.println("Geek-building: String Constructor" + name); 
    } 
} 
public class Quiz10 extends Building{
	Quiz10()  
    { 
        System.out.println("Geek-House "); 
    } 
	Quiz10(String name)  
    { 
        this(); 
        System.out.println("Geek-house: String Constructor" + name); 
    } 
    public static void main(String[] args)  
    { 
        new Quiz10("Geek"); 
    }
}
