package org.bank;

public class BankInfo {
	public void saving() {
		System.out.println("50000");
	}
	public void fixed() {
		System.out.println("10000");
	}
	public void deposit() {
		System.out.println("5000");
	}
	public static void main(String[] args) {
		BankInfo details=new BankInfo();
		details.saving();
		details.fixed();
		details.deposit();
	}

}
