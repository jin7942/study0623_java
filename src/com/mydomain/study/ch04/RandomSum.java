package com.mydomain.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

		// 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라
		
//		int max = (startNum < endNum) ? endNum : startNum;
//		int min = (startNum > endNum) ? endNum : startNum;
		
//		int sum = 0;
//		for (int i = min; i <= max; i++) {
//			sum += i;
//		}
//		System.out.println(min + " ~ " + max+ " 사이의 합 : " + sum);
		
		int startNum = 0;
		int endNum = 0;
		
		for (int i = 1; i <= 2; i++) {
			startNum = randNum();
			endNum = randNum();
			
			if (startNum >= endNum) {
				i--;
			}
		}
		
		int sum = 0;
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		System.out.println(startNum + " ~ " + endNum + " 사이의 합 : " + sum);
		
	}
	
	public static int randNum() {
		double min = 1;
		double max = 100;
		
		return (int) ((Math.random() * (max - min)) + min);
	}

}