package com.mydomain.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {

//		int 타입 변수 3개 선언
//		세 정수중에서 최대값 최소값을 구하는 프로그램을 작성

		int num1 = 7;
		int num2 = 7;
		int num3 = 7;
		
		int max = 0;
		int min = 0;
		
		if (num1 != num2 && num2 != num3 && num3 != num1) { 
			if (num1 >= num2 && num1 >= num3) {
				max = num1;
				
				if (num2 <= num3) {
					min = num2;
				} else min = num3;
	
			} else if (num2 >= num1 && num2 >= num3) {
				max = num2;
				
				if (num3 <= num1) {
					min = num1;
				} else min= num3;
			 
			} else {
				max = num3;
				
				if (num1 <= num2) {
					min = num1;
				} else min = num2;
			}
			
			System.out.println("최대값 : " + max + " 최소값 : " + min);	
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요.");
		}
		
	}

}
