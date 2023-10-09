package week4.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeleteLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("9");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("9123456780");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.xpath("//a[text()='10113']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10113");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		driver.close();
		
	}
}

