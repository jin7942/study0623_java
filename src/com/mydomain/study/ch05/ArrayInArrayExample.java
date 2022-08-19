package com.mydomain.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		// 1. 개인 평균
		// 2. 과목 평균
		
		int scores[][] = {
				{ 98, 88, 55 }, 
				{ 55, 77, 66 }, 
				{ 44, 55, 55 }, 
				{ 55, 33, 44 }, 
				{ 97, 88, 11 }, 
		};
		
	
		String student[] = { "장원영", "장동건", "고소영", "배유빈", "유시아" };
		
		int sum = 0;
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		
		for (int i = 0; i < scores.length; i++) {
			for (int j =0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			korAvg += scores[i][0];
			engAvg += scores[i][1];
			mathAvg += scores[i][2];

			System.out.println(student[i] + "의 평균 : " + ((double) sum / 3));
			sum = 0;
			
		}
		System.out.println("국어 평균 : " + (korAvg / 5));
		System.out.println("영어 평균 : " + (engAvg / 5));
		System.out.println("수학 평균 : " + (mathAvg / 5));
		
	}

}
