package com.capgemini.quiz.day2;

public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_variable [] = new int[10];
	    for (int i = 0; i < 10; ++i) {
                array_variable[i] = i/2;
                array_variable[i]++;
                System.out.print(array_variable[i] + " ");
                i++;

	}
	}
	

}
//a) 0 2 4 6 8
//b) 1 2 3 4 5----ans
//c) 0 1 2 3 4 5 6 7 8 9
//d) 1 2 3 4 5 6 7 8 9 10