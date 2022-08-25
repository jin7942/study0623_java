package com.mydomain.study.ch07.frist;

public class CellPhone {

	String model;
	String color;
	
	void powerON() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoiceON(String message) {System.out.println("자기 : " + message);}
	void receivcvoice(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
	
}
