package com.capgemini.assignments.day3;
class cal{
	public int add(int ...n) {
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cal c=new cal();
System.out.println(c.add(4,5,6,7,8));
	}

}
