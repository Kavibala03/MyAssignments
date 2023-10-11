package org.testing;

public class Automation implements Language,TestTool{
	public void java() {
		System.out.println("Java");
	}
	public void selenium() {
		System.out.println("Selenium");
	}
	public void python() {
		System.out.println("Python");
	}
	public void ruby() {
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		Automation executes=new Automation();
		executes.java();
		executes.selenium();
		executes.python();
		executes.ruby();
	}
}
