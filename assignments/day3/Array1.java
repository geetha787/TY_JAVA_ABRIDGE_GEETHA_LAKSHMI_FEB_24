package com.capgemini.assignments.day3;

public class Array1 {
	public static void main(String[] args) {
		
	
	double[] n= {10.4,20.5,30.9,4.0};
	printArrayData(n);
	System.out.println("________");
	double[] a=getArrayData();
	}
	static void printArrayData(double[]a) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}		
		
	}
	static double[] getArrayData() {
		double[] values= {10.4,20.5,30.9,4.0};
		return values;
	}
}
