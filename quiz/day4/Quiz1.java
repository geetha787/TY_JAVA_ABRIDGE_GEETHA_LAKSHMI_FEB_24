package com.capgemini.quiz.day4;

public class Quiz1 {
	
 public void display(char c)
	{
		System.out.println(c);
	}
	public void display(char c, int num)
	{
		System.out.println(c+" "+num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Quiz1 q1=new Quiz1();
q1.display('a');
q1.display('a', 10);
	}

}
