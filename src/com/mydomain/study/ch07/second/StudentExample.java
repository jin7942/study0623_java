package com.mydomain.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 객체를 생성하고
		// 모듈 필드를 출력하시오.
		
		Student student = new Student("jinbuem", "0101");
		Student student2 = new Student("jin", "1010", 1234);
		
		System.out.println(student.name + " " + student.ssn);
		System.out.println(student2.name + " " + student2.ssn + " " + student2.studentNo);
		
	}

}
