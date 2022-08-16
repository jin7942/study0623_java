package com.mydomain.study.ch04;

public class WhilePrintfrom1To10Example {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			sum += i;
			System.out.println(i + " : " + (sum));
			i++;
		}
		
	}

}
