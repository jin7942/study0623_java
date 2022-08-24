package com.mydomain.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("장원영", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김진범", 22);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.age : " + k2.age);

		System.out.println(Korean.nationality);
		System.out.println(Korean.statiTest(10));
	}
}