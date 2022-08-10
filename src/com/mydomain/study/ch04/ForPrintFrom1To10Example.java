package com.mydomain.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			sum += 1;
		}
		
		System.out.println(sum);
		
	}

}
