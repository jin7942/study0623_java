package com.mydomain.study.ch07.sortExample;

public class Child extends Parents {
	
	@Override
	public int getSum(int arr[]) {
		sum = ( arr[0] * arr[1] ) + arr[2] + 10;
		
		return sum;
	}
	
	
}
