package com.capgemini.assignments.strings;
import java.util.Scanner;

public class ToCharArray {

	public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter string");
			String s1=scan.next();
			char[] ch=s1.toCharArray();
			for (int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
			
			
			// TODO Auto-generated method stub

		}


}
