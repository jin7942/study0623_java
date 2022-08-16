package com.mydomain.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		double max = 100;
		double min = 1;
		
		int startNum = 0;
		int endNum = 0;
		
		for (int i = 0; i <= 2; i++) {
			int randNum1 = (int) ((Math.random() * (max - min)) + min);
			int randNum2 = (int) ((Math.random() * (max - min)) + min);

			if (randNum1 > randNum2) {
				startNum = randNum2;
				endNum = randNum1;
			} else if (randNum1 < randNum2) {
				startNum = randNum1;
				endNum = randNum2;
			} else {
				i--;
			}
			
		}
		
		int sum = 0;
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		System.out.println(startNum + " ~ " + endNum + " 사이 숫자의 합 : " + sum);
		
	}

}
