package com.subesh;

public class FactorialExample {
	public static void main(String[] args) {
		int n = 6;
		int fact = 1, i;
		for(i = 1; i<=n; i++) {
			fact=fact * i;
		}
		System.out.println(fact);
	}

}
