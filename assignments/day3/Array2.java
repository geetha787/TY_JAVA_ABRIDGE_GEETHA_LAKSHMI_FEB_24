package com.capgemini.assignments.day3;

public class Array2 {
public static void main(String[] args) {
	

long[] numbers= {10,20,30,40};
	printArrayData(numbers);
	System.out.println("________");
	long[] nums=getArrayData();
	
	}
	static void printArrayData(long[]a) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	static long[] getArrayData() {
		long[] values= {109,250,30,40};
		return values;
	}

}
