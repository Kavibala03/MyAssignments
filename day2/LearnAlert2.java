package week6.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://buythevalue.in/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("600123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='harman_btn4']/span[text()='View Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='checkout']")).click();
		Thread.sleep(2000);
		Alert value = driver.switchTo().alert();
		value.accept();
		
		
	}
}
