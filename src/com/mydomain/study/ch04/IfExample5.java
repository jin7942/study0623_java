package com.mydomain.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {

//		int 타입 변수 2개 선언
//		사분면 어디에 해당되는지 출력
		
		int x = -10;
		int y = 10;
		
		if (x > 0 && y > 0) {
			System.out.println("1사분면");
		} else if (x < 0 && y > 0) {
			System.out.println("2사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("3사분면");
		} else if (x > 0 && y < 0) {
			System.out.println("4사분면");
		} else if (x == 0 && y != 0) {
			System.out.println("(x, y)는 x 축 위에 있습니다.");
		} else if (x != 0 && y == 0) {
			System.out.println("(x, y)는 y 축 위에 있습니다.");
		} else System.out.println("0");
		
	}

}
