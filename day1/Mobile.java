package week1.day1;

public class Mobile {
	public void receiveCall() {
		System.out.println("Receive Call");
	}
	public void sendMail() {
		System.out.println("Send Mail");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}
	public static void main(String[] args) {
		Mobile vivo=new Mobile();
		vivo.receiveCall();
		vivo.sendMail();
		vivo.enterPassword();
	}
}
