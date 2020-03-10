package com.capgemini.quiz.day2;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
	    int d[] = a;
	    int sum = 0;
	    for (int j = 0; j < 3; ++j)
                sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
	    System.out.println(sum);
	
	}

}
//a) 38
//b) 39
//c) 40--ans
//d) 41