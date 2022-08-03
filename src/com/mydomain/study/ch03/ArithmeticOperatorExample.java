package com.mydomain.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
//		int x1 = 5;
//		int x2 = 2;
//		
//		int result1 = x1 + x2;
//		System.out.println(result1);
//		
//		int result2 = x1 - x2;
//		System.out.println(result2);
//		
//		int result3 = x1 * x2;
//		System.out.println(result3);
//		
//		int result4 = x1 / x2;
//		System.out.println(result4);
//		
//		int result5 = x1 % x2;
//		System.out.println(result5);
//		
		double result = ((5/3) - (5/8)) * (49/5);
		System.out.println(result);
		
		double result2 = 5 - (3.25 - (11/6)) * (12/17);
		System.out.println(result2);
		
		int a = 8;
		int b = 7;
		int c = 5;
		System.out.println(a + b + c);
		
		int i = 1;
		int j = 9;
		int k = 5;
		System.out.println(i + j + k);
		
		sum(8, 7, 5);
		
		System.out.println("홍길동 평균 : " + avg(60, 70, 85, 90, 45));
		System.out.println("박말순 평균 : " + avg(50, 75, 70, 60, 70));
		System.out.println("고장난 평균 : " + avg(55, 60, 64, 58, 90));
		System.out.println("도룡뇽 평균 : " + avg(80, 70, 63, 88, 78));
	}
	
	
	public static double avg(double num1, double num2, double num3, double num4, double num5) {
		return (num1 + num2 + num3 + num4 + num5) / 5;
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + " + " + b + " + " + c  + " = " + (a + b + c) );
	}
}
