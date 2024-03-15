package sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(7000);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", findElement);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Kavibala");
		WebElement ele= driver.findElement(By.xpath("//input[@name='Sic']"));
		Actions device=new Actions(driver);
		device.scrollToElement(ele).perform();
		driver.findElement(By.xpath("//label[text()='Ownership']//following::button")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='toastContainer slds-notify_container slds-is-relative']")).getText();
		System.out.println(text);
		}
}
