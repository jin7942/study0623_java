package com.mydomain.study.ch06;

public class Tv {
	
	public static String company = "Samsung";
	public static String model = "OLED";
	public static String info;
	
	public String version = "1.0";
	
	static {
		info = company + " " + model;
	}
	
}
