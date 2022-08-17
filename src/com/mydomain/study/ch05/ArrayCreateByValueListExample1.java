package com.mydomain.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int scoreChemistry[] = { 88, 99, 45, 86, 34 };
		double sum = 0;

		for (int i = 0; i < scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		System.out.println("평균 : " + (sum / scoreChemistry.length));
		
	}

}
