package com.mydomain.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 80;
		int temp = score % 10;
		
		if (score >= 90) {
			System.out.print("A");
		} else if (score >= 80) {
			System.out.print("B");
		} else if (score >= 70) {
			System.out.print("C");
		} else if (score >= 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
		
		if (temp >= 7) {
			System.out.print("+");
		} else if (temp <= 2) {
			System.out.print("-");
		} else return;
		
	}
}

// 97점이상 + 92점 이하 -
