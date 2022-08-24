package com.mydomain.study.ch06;

public class Board {

	String name = "jinbuem";
	int view = 0;
	boolean isUse = false;
	
	Board() {
		
	}
	
	Board(String name) {
		this.name = name;
	}
	
	Board(String name, int view) {
		this.name = name;
		this.view = view;
	}

	Board(String name, boolean isUse) {
		this.name = name;
		this.isUse = isUse;
	}
	
	Board(String name, int view, boolean isUse) {
		this.name = name;
		this.view = view;
		this.isUse = isUse;
	}
	
	public void print() {
		System.out.println(name + " " + view + " " + isUse);
	}
	
}
