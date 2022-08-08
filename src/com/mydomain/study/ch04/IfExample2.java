package com.mydomain.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {

		int price = 36000;
		int memberShip = 3;
		
		if (memberShip == 1) {
			System.out.println("정가 : " + price + "원 " + "할인가 : " + (price - (price * 0.05)) + "원");
		} 
		else if (memberShip == 2) {
			System.out.println("정가 : " + price + "원 " + "할인가 : " +(price - (price * 0.1)) + "원");
		} 
		else if (memberShip == 3) {
			System.out.println("정가 : " + price + "원 " + "할인가 : " + (price - (price * 0.15)) + "원");
		} 
		else if (memberShip == 4) {
			System.out.println("정가 : " + price + "원 " + "할인가 : " + (price - (price * 0.20)) + "원");
		} 
		else if (memberShip == 5) {
			System.out.println("정가 : " + price + "원 " + "할인가 : " + (price - (price * 0.027)) + "원");
		} else System.out.println("err");
		
	}

}
