package com.mydomain.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 92;
		int temp = score % 10;
		
		if (score >= 97) {
			System.out.println("A+");
			
			if (score >= 92) {
				System.out.println("A");
			} else System.out.println("A-");
		} 
		else if (score >= 87) {
			System.out.println("B+");
			
			if (score >= 82) {
				System.out.println("B");
			} else System.out.println("B-");
		} 
		else if (score >= 77) {
			System.out.print("C+");
			
			if (score >= 72) {
				System.out.println("C");
			} else System.out.println("C-");
			
		} 
		else if (score >= 67) {
			System.out.print("D");
			
			if (score >= 62) {
				System.out.println("D+");
			} else System.out.println("D-");
		} 
		else {
			System.out.print("F");
		}
		
		if (temp >= 2) {
			System.out.print("+");
		} else System.out.print("-");

		
	}
}

// 97점이상 + 92점 이하 -
