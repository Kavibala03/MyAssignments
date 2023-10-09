package week4.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kavi");
		driver.findElement(By.id("lastNameField")).sendKeys("Arangasamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kavi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Arangasamy");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("debugging");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kavibalaarangasamy06@gmail.com");
		WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDownBox=new Select(dropDown);
		dropDownBox.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Don't miss any information");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.id("sectionHeaderTitle_contacts"));
		String text=driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(text);
	}

}
