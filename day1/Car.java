package week1.day1;

public class Car {
	public void wearSeatBelt() {
		System.out.println("wear SeatBelt");
	}
    public void openWindow() {
    	System.out.println("open Window");
    }
    public void turnOnLight() {
    	System.out.println("turn On Light");
    }
    public static void main(String[] args) {
		Car cooper=new Car();
		cooper.wearSeatBelt();
		cooper.openWindow();
		cooper.turnOnLight();
	}
}
