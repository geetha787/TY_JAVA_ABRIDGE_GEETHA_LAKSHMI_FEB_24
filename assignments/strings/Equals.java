package com.capgemini.assignments.strings;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		System.out.println("enter string");
		String s2=scan.next();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}

}
