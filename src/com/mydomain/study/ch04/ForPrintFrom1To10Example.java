package com.mydomain.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		// 1부터 10 까지 더하는 프로그램 작성

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
	}

}
