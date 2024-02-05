package assign;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://www.pvrcinemas.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
	WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
	Select dropDown=new Select(city);
	dropDown.selectByVisibleText("Chennai");
	Thread.sleep(3000);
	WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
	Select dropDown1=new Select(genre);
	dropDown1.selectByVisibleText("ANIMATION");
	Thread.sleep(5000);
	WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));
	Select dropDown2=new Select(lang);
	dropDown2.selectByVisibleText("ENGLISH");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	Thread.sleep(5000);
	WebElement cinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));
	cinema.sendKeys("PVR");
	cinema.click();
	Thread.sleep(5000);
	WebElement time = driver.findElement(By.xpath("//select[@name='timings']"));
	Select dropDown3=new Select(time);
	dropDown3.selectByIndex(3);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Kavi");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8248953009");
	Thread .sleep(5000);
	driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nothing");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
	driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[1]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kavibalaarangasamy06@gmail.com");
	Thread.sleep(5000);
	WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
	Select dropDown4=new Select(food);
	dropDown4.selectByVisibleText("No");
	Thread .sleep(5000);
	driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();	
	Thread .sleep(5000);
	driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
	String title = driver.getTitle();
	System.out.println("title"+title);
}
}
