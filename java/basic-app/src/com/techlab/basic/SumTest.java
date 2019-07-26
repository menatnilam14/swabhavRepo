package com.techlab.basic;

public class SumTest {
	public static void main(String[] args) {
		System.out.println(args.length);
		int argSize = args.length;
		int sum = 0;
		int[] arr = new int[argSize];
		for (int i = 0; i < argSize; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		for (int m = 0; m < argSize; m++) {
			sum = arr[m] + sum;
		}
		System.out.println("sum of" + argSize + "number is " + sum);
	}
}
