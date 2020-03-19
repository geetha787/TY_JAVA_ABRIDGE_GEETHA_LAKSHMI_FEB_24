package com.capgemini.hasarelationship;

public class MarkerMain {
public static void main(String[] args) {
	Person p=new Person();
	System.out.println(p.name);
	p.walk();
	System.out.println( p.m.cost);
	System.out.println(p.m.color);
	p.m.write();
}
}