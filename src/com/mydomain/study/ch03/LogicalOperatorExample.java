package com.mydomain.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

		int a = 65;
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("===============================");
		
		if (a >= 65 | a <= 90) {
			System.out.println("둘다참");
		}
		if (a >= 65 | a <= 90) {
			System.out.println("한개만 참");
		}
		if (a >= 66 | a <= 50) {
			System.out.println("안보임");
		}		
		if (a >= 65 || a <= 90) {
			System.out.println("둘다참");
		}
		if (a >= 65 || a <= 90) {
			System.out.println("한개만 참");
		}
		if (a >= 66 || a <= 50) {
			System.out.println("안보임");
		}
		
		System.out.println("===============================");
		
		if (a >= 65 ^ a <= 50) {
			System.out.println("한개만 참");
		}
		if (a >= 65 ^ a <= 90) {
			System.out.println("둘다 참");
		}
		if (a >= 66 ^ a <= 90) {
			System.out.println("한개만 참");
		}
		if (a >= 66 ^ a <= 50) {
			System.out.println("둘다 거짓");
		}
		
	}

}
