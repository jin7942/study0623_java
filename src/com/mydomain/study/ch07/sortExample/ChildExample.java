package com.mydomain.study.ch07.sortExample;

public class ChildExample {

	public static void main(String[] args) {
		Parents parents = new Parents();
		Child child = new Child();

		int arr[] = { 40, 10, 20 };

		System.out.println("정렬 전 =============");
		parents.printArr(arr);

		System.out.println("정렬 후 =============");
		parents.sortByAsc(arr);
		parents.printArr(arr);

		System.out.println("부모 메서드2 =============");
		System.out.println(parents.getSum(arr));

		System.out.println("자식 메서드2 =============");
		System.out.println(child.getSum(arr));

		System.out.println("값 차이 =============");
		System.out.println(parents.getSum(arr) - child.getSum(arr));
	}

}
