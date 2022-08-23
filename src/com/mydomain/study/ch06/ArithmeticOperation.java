package com.mydomain.study.ch06;

public class ArithmeticOperation {
	
	public void resultPrint(int a, int b) {
		System.out.println(a + " + " + b + " = " + add(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " * " + b + " = " + mul(a, b));
		
		if (b == 0) {
			System.out.println("0으로는 나누기를 할 수 없습니다.");
		} else {
			System.out.println(a + " / " + b + " = " + div(a, b));
		}
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	    
	public int mul(int a, int b) {
		return a * b;
	}
	
	public double div(int a, int b) {
			return (double) a / b;	
		}
	
	public void strPrint(String a, String b) {
		System.out.println(a + b);
	}
	
}
