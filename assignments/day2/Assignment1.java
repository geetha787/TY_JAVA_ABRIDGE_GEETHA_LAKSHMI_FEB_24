package com.capgemini.assignments.day2;
import java.util.Scanner;

 class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		long phnum;
		String email;
		Scanner sc=new Scanner(System.in);
		while(true) {
        System.out.println("choose 1 for name");
        System.out.println("choose 2 for age");
        System.out.println("choose 3 for phnum");
        System.out.println("choose 4 for email");
        System.out.println("choose 5 for exit");
        int x=sc.nextInt();
        switch(x) {
        case 1:System.out.println("enter name");
        name= sc.next();
        System.out.println(name);
        break;
        case 2:System.out.println("enter age");
        age=sc.nextInt();
        System.out.println(age);
        break;
        case 3:System.out.println("enter phnum");
        phnum=sc.nextLong();
        System.out.println(phnum);
        break;
        case 4:System.out.println("enter email");
        email=sc.nextLine();
        System.out.println(email);
        break;
        case 5:System.out.println("exit");
        break;
        }
		
		
        
		}
		
		}
 }
 
 

