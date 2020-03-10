package com.capgemini.quiz.day4;

public class Quiz3 {
	protected final void getDetails()
	{
		System.out.println("Quiz3 class");
	}

}
 class Test extends Quiz3
{
	protected final void getDetails() {
		System.out.println("Quiz3");
	}
	public static void main(String[] args) {
		Quiz3 q1=new Quiz3();
		q1.getDetails();
	}
}
// there is a compilation error becoz final and static methods cannot be over ridden
