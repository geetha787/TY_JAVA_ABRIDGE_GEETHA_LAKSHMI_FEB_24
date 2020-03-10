package com.capgemini.quiz.day6;
abstract class Demo 
{ 
    public int a; 
    Demo() 
    { 
        a = 10; 
    } 
  
    abstract public void set(); 
    abstract  public void get(); 

//    abstract final public void get();---error 
  
} 
public class Quiz1 extends Demo {
	public void set(int a) 
    { 
        this.a = a; 
    } 
	public void set() {
		System.out.println("set method");
	}
  
    final public void get() 
    { 
        System.out.println("a = " + a); 
    } 
  
    public static void main(String[] args) 
    { 
    	Quiz1 obj = new Quiz1(); 
        obj.set(20); 
        obj.get(); 
    } 
}
//Final method can’t be overridden. 
//Thus, an abstract function can’t be final.