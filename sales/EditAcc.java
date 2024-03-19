package sales;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditAcc {
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
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		name.sendKeys("Kavibala",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Kavibala']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Show more actions']/preceding-sibling::lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//label[text()='Annual Revenue']"));
		Actions device = new Actions(driver);
		device.scrollToElement(element1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='Type']/following::div)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		WebElement element2 = driver.findElement(By.xpath("//label[text()='Billing Street']"));
		Actions device1= new Actions(driver);
		device1.scrollToElement(element2).perform();
		driver.findElement(By.xpath("(//label[text()='Industry']/following::div)[1]")).click();
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Insurance']"));
		Actions device2 = new Actions(driver);
		device2.scrollToElement(element3).perform();
		driver.findElement(By.xpath("//span[text()='Healthcare']")).click();
		WebElement element4 = driver.findElement(By.xpath("//label[text()='SLA']"));
		Actions device3 = new Actions(driver);
		device3.scrollToElement(element4).perform();
		driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys("Aranthangi");
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("chennai");
		WebElement element5 = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']"));
		Actions device4 = new Actions(driver);
		device4.scrollToElement(element5).perform();
		driver.findElement(By.xpath("(//label[text()='Customer Priority']/following::button)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Low']/parent::span")).click();
		driver.findElement(By.xpath("(//label[text()='SLA']/following::button)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		WebElement element6 = driver.findElement(By.xpath("//label[text()='Description']"));
		Actions device5 = new Actions(driver);
		device5.scrollToElement(element6).perform();
		driver.findElement(By.xpath("(//label[text()='Active']/following::button)[1]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		driver.findElement(By.xpath("(//label[text()='Upsell Opportunity']/following::button)[1]")).click();
		driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();
		WebElement element7 = driver.findElement(By.xpath("//label[text()='Rating']"));
		Actions device6 = new Actions(driver);
		device6.scrollToElement(element7).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Phone']")).clear();
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("8248953009");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//span[text()='(824) 895-3009']")).getText();
		System.out.println("Phone number:" + text);
		driver.close();

	}

}
