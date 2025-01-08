package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing Chrome Browser Driver and Opening Facebook Page
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Creating a New Account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Account");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		
		
		
		//Handling Dropdown for Date of Birth selection
		Select dobDate = new Select(driver.findElement(By.id("day")));
		dobDate.selectByValue("12");
		
		Select dobMonth = new Select(driver.findElement(By.id("month")));
		dobMonth.selectByVisibleText("Feb");
		
		Select dobYear = new Select(driver.findElement(By.id("year")));
		dobYear.selectByVisibleText("1990");
		
		//Selecting Gender (Radio Button)
		
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();

		//Submitting the form to create an account
		
		driver.findElement(By.xpath("//div/button[@name=\"websubmit\"]")).click();
		
		
		
	}

}