package com.mydomain.study.ch07.forth;

public class SupersonicAirplane extends Airplane{
	
	public int flyMode = Constants.NORMAL;

	@Override
	public void fly() {
		if(flyMode == Constants.SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	
	
	
}
