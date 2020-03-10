package com.capgemini.arrays;

public class C {
public static void main(String[] args) {
	String [] names= {"shalini","srujana","pallavi","jenifer"};
	printNames(names);
	
	String[]values=getNames();
	printNames(values);
}
static void printNames(String[] n) {
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
}
static String[]getNames(){
	String[] names= {"anu","divya","sreeja","priya"};
	return names;
}

}
