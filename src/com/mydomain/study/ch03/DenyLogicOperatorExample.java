package com.mydomain.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		int j = 3;
		if (!(j==3)) {
			System.out.println("3이아님");
		} else {
			System.out.println("3임");
		}
		
	}

}
