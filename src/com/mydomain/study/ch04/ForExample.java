package com.mydomain.study.ch04;

public class ForExample {

	public static void main(String[] args) {

		System.out.println("=======================");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("=======================");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if ((i > 1 && i < 5) && (j == 2 || j == 3 || j == 4)) {
					System.out.print(" ");
				} else System.out.print("*"); 
				
			}
			System.out.print("\n");
		}
		
		System.out.println("=======================");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				
				if ((i >= 10) && (j % 2 == 0)) {
					if (j >= 9) {
						System.out.print("0");
						break;
					}
					
					System.out.print(" ");
				} else System.out.print(j); 
			}
			System.out.print("\n");
		}
		
		System.out.println("=======================");

	}

}
