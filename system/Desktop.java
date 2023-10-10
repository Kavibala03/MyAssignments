package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("15.6 Inches");
	}
	public static void main(String[] args) {
		Desktop size=new Desktop();
		size.computerModel();
		size.desktopSize();
	}

}
