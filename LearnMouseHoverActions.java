package week7.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHoverActions {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions device=new Actions(driver);
		device.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		for (int i=0;i<elements.size();i++) {
			String text = elements.get(i).getText();
			System.out.println(i+"  "+text);
		}
	}

}
