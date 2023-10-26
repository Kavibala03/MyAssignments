package week6.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0wp4yggz5ikn51wjgrja8jnf8p540318.node0");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		//driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("chennai");
		promptAlert.accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		//driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		}
}
