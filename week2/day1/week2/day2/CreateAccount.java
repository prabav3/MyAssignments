package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); //Initializing the Chrome Browser Driver
		driver.get("http://leaftaps.com/opentaps/control/main"); // Loading the URL
		
		driver.manage().window().maximize(); // Maximizing the Chrome Browser Window
		
		//Logging in with valid Credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.className("crmsfa")).click();
	
		//Creating a new Account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Praba");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByVisibleText("Computer Software");
		
		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");
		
		Select source = new Select(driver.findElement(By.id("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select marketingCampaign = new Select(driver.findElement(By.id("marketingCampaignId")));
		marketingCampaign.selectByIndex(6);
		
		Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		
		//Submitting to Create a new account
		driver.findElement(By.xpath("//*[@class=\"smallSubmit\"]")).click();
		
		//Closing the Browser
		driver.close();
		
	}

}