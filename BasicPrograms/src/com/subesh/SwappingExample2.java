package com.subesh;

public class SwappingExample2 {
	public static void main(String[] args) {
		int x=6, y=5;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x " + x);
		System.out.println("y " + y);
	}

}
