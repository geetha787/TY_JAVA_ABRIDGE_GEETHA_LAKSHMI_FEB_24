package com.capgemini.arrays;

public class B {

	public static void main(String[] args) {
int[] numbers= {10,20,30,40};
	printArrayData(numbers);
	System.out.println("________");
	int[] nums=getArrayData();
	/**
	 * for (int i=0i<nums.length;i++){system.out.println(nums[i]);
	
	 */
	}
	static void printArrayData(int[]a) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	static int[] getArrayData() {
		int[] values= {1,20,30,40};
		return values;
	}

}
