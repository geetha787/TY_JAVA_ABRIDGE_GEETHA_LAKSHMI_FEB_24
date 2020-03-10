package com.capgemini.arrays;

public class A {
public static void main(String[] args) {
	byte[] b= new byte[4];
	b[0]=1;
	b[1]=2;
	b[2]=3;
	b[3]=4;
	System.out.println(b[0]);
	System.out.println(b[1]);
	System.out.println(b[2]);
	System.out.println(b[3]);
	System.out.println("_________________");
	System.out.println("");
	for (int i=0;i<4;i++) {
		System.out.println(b[i]);
	}
	System.out.println("_________________");

		boolean[] values=new boolean[4];
		values[0]=true;
		values[1]=false;
		values[2]=true;
		values[3]=false;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println("_________________");
		for (int i=0;i<4;i++) {
			System.out.println(values[i]);
		}
		System.out.println("_________________");

		System.out.println("size of b="+b.length);
	System.out.println("size of values="+values.length);
	System.out.println("_________________");

	int[] n= {10,20,30,40,50};
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
		
	}
}
