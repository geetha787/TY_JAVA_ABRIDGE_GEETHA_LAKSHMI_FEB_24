package com.capgemini.quiz.day4;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 m1();  // Line 5 
    } 
  
    static void m1()  
    { 
    	Quiz8   t1 = new Quiz8(); 
    	Quiz8 t2 = new Quiz8(); 
	}

}
//How many objects are eligible for garbage collection 
//after execution of line 5 ?
//ans 2
//Explanation :
//Since t1 and t2 are local objects of m1() method, 
//so they become eligible for garbage collection after 
//complete execution of method unless any of them is returned.

