package com.mydomain.study.ch07.frist;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerON();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		dmbCellPhone.turnOffDmb();
		
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("Iphone10", "Black", 6);
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(89);
		dmbCellPhone2.turnOffDmb();
		
		dmbCellPhone2.powerON();
		dmbCellPhone2.powerOff();
		
	}
}
