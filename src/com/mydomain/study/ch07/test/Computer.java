package com.mydomain.study.ch07.test;

public class Computer extends Calculator{

	@Override
	public double getCircleArea(double radius) {

		return radius * radius * Constants.PAI_2;
	}

}
