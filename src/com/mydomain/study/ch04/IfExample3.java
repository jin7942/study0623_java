package com.mydomain.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {

		// int 타입 변수 2개 선언
		// 두 정수가 주어졌을대 두 정수를 비교하여
		// 크기 비교 결과를 나타내는 프로그램을 작성
		
		int num1 = 50;
		int num2 = 20;
		
		if (num1 > num2) {
			System.out.println(num1 + " 은 " + num2 + " 보다 큽니다.");
		} else if (num1 < num2) {
			System.out.println(num1 + " 은 " + num2 + " 보다 작습니다.");
		} else System.out.println(num1 + " 과 " + num2 + " 는 같습니다.");
		
	}

}
