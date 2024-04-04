package clsassign;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheapOair {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//close the notification
		driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
		//click one way
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
		//clear the From box
		driver.findElement(By.xpath("//a[@class='suggestion-box__clear icon']")).click();
		//search Chennai
		driver.findElement(By.xpath("//input[@id='from0']")).sendKeys("chennai");
		//click Chennai
		driver.findElement(By.xpath("//li[@data-suggestion='MAA']")).click();
		//clear the To box
		driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[2]")).click();
		//search Singapore
		driver.findElement(By.xpath("//input[@id='to0']")).sendKeys("Singapore");
		Thread.sleep(30);
		//click first Singapore option
		driver.findElement(By.xpath("(//div[@class='suggestion-displayText'])[1]")).click();
		Thread.sleep(30);
		//click the date
		driver.findElement(By.xpath("(//a[text()='5'])[1]")).click();
		//click traveler
		driver.findElement(By.id("travellerButton")).click();
		//add adult
		driver.findElement(By.xpath("//button[@id='addadults']")).click();
		//click search flights
		driver.findElement(By.xpath("//input[@id='searchNow']")).click();
		Thread.sleep(3000);
		//print the price
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='currency text-nowrap']"));
		for(int i=0;i<ele.size();i++) {
		   String text = ele.get(i).getText().replaceAll("USD"," ");
			System.out.println(text);
		}
		//print the lowest amount
		String[] price= {"141.86","131.22","163.82","238.26","232.36","243.25","210.13","246.02","252.96","416.76","258.92","210.13","596.46","254.89","269.45","243.18","252.96","258.73","261.44","236.36"};
        Arrays.sort(price,Collections.reverseOrder());
        System.out.println("Decending order"+Arrays.toString(price));
        String text1 = driver.findElement(By.xpath("(//span[@class='currency text-nowrap'])[2]")).getText();
	      System.out.println("Lowest price:"+text1);
	}
}
