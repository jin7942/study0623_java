package com.mydomain.study.ch06;

public class CarSecond {
	
	String name = "아반떼";
	String color = "black";
	int cc = 1600;
	
	CarSecond(String name) {
		this.name = name;
	}
	
	CarSecond(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
	CarSecond(String name, String color, int cc) {
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	
}
