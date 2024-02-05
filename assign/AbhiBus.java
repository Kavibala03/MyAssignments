package assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbhiBus {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://www.abhibus.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(3000);
	WebElement from = driver.findElement(By.xpath("//div[@class='container text-input  ']"));
	from.click();
	driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
	driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
	Thread.sleep(3000);
	WebElement bus= driver.findElement(By.xpath("//h5[text()='Parveen Travels']"));
	String text = bus.getText();
	System.out.println(text);
	driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	WebElement seat= driver.findElement(By.xpath("//small[text()='24']"));
	String text1 = seat.getText();
	System.out.println(text1);
	driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='SU1']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
	driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
	Thread.sleep(3000);
	WebElement selected = driver.findElement(By.xpath("//span[text()='SU1']"));
	String text2 = selected.getText();
	System.out.println(text2);
	Thread.sleep(3000);
	WebElement fare = driver.findElement(By.xpath("//span[text()='799']"));
	String text3 = fare.getText();
	System.out.println(text3);
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
}
}