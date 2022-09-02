package com.mydomain.study.ch07.test;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		double radius = 7;
		
		System.out.println("원의 반지름 : " + radius + "\n");
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행" );
		System.out.println("원면적 : " + calculator.getCircleArea(radius) + "\n");
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적 : " + computer.getCircleArea(radius) + "\n");
		
		
	}

}
