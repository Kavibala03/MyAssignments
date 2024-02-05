package assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for b");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
	WebElement num = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"));
	System.out.println(num.getText());
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[4]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
	WebElement name = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	System.out.println(name.getText());
	Thread.sleep(5000);
	WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
	System.out.println(price.getText());
	Thread.sleep(5000);
	String title = driver.getWindowHandle();
	//Thread.sleep(3000);
	String title2 = driver.getTitle();
	System.out.println("title"+title);
	driver.close();
}
}
