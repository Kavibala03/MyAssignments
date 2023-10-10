package org.bank;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("8000");
	}
	public static void main(String[] args) {
		AxisBank info=new AxisBank();
		info.saving();
		info.fixed();
		info.deposit();
	}

}
