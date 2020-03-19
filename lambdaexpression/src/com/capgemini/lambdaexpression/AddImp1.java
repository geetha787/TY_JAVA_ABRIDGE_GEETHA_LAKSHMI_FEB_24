package com.capgemini.lambdaexpression;

public class AddImp1 {

	public static void main(String[] args) {
Add f=(a,b)->{
	System.out.println(a+b);
};
f.add(3, 4);

	Multiply m=(h,i)->{
		return h*i;
	};
	int x=m.multiply(2, 50);
	System.out.println(x);
	}
	
}
