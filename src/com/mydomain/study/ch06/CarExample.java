package com.mydomain.study.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car.name);
		
		Iphone iphone = new Iphone();
		System.out.println(iphone.name);
		
		iphone.pr();
		
		Handbag handbag = new Handbag();
		System.out.println(handbag.name);
		
	}

}
