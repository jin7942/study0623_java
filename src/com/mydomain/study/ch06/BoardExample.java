package com.mydomain.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		Board board2 = new Board("buem");
		Board board3 = new Board("jin", 10);
		Board board4 = new Board("jinbu", true);
		Board board5 = new Board("jinbuem", 20, true);

		board.print();
		board2.print();
		board3.print();
		board4.print();
		board5.print();
		
	}

}
