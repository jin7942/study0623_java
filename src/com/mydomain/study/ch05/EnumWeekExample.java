package com.mydomain.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc = Week.MONDAY;
		
		System.out.println(Week.FRIDAY);
		System.out.println(abc);

		String name = abc.name();
		System.out.println("name : " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal : " + ordinal);
		
		Week xyz = Week.THUESDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = abc.compareTo(abc);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		Week days[] = Week.values();
		
		int index = 0;
		for (Week day : days) {
			System.out.println(index + ": day: " + day);
			index++;
		}
		
	}
	
}
