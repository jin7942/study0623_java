package com.mydomain.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carSecond = new CarSecond("쏘나타");
		CarSecond carSecond2 = new CarSecond("쏘나타", 2000);
		CarSecond carSecond3 = new CarSecond("쏘나타", "red", 2000);
		
		System.out.println(carSecond.name + " " + carSecond.color + " " + carSecond.cc);
		System.out.println(carSecond2.name + " " + carSecond2.color + " " + carSecond2.cc);
		System.out.println(carSecond3.name + " " + carSecond3.color + " " + carSecond3.cc);
	}

}
