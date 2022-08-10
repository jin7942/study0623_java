package com.mydomain.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 1;
		
		switch (num) {
			case 1:
				System.out.println("1");
				break;
				
			case 2:
				System.out.println("2");
				break;
			
			default:
				System.out.println("1도 2도 아닌 정수 입니다.");
				break;

		}
		
		String position = "사원";
		
		switch (position) {
			case "사원":
				System.out.println("연봉 5000");
				break;
				
			case "대리":
				System.out.println("연봉 7000");
				break;
				
			case "과장":
				System.out.println("연봉 9000");
				break;
				
			case "부장":
				System.out.println("연봉 11,000");
				break;
				
			case "사장":
				System.out.println("연봉 30,000");
				break;
			
			default:
				System.out.println("인턴 최저");
				break;
			
		}
		
	}

}
