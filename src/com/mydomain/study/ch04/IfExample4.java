package com.mydomain.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {

		int num1 = 11;
		
		if (num1 != 0) {
			if (num1 % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다.");
			}
		} else System.out.println("0은 홀짝을 판단할 수 없습니다.");
		
	}

}
