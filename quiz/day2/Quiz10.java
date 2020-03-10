package com.capgemini.quiz.day2;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
        x = 5;
        {
        int y = 6;
        System.out.print(x + " " + y);
        }
        System.out.println(x + " " + x);//System.out.println(x+" "+y);
	}

}
//a) 5 6 5 6
//b) 5 6 5
//c) Runtime error
//d) Compilation error-----ans
//o/p=5 65  5

//Second print statement doesn’t have access to y , 
//scope y was limited to the block defined after initialization of x.