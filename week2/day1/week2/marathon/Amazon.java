package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		  
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Bags for boys", Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
		WebElement totalItemBag = driver.findElement(By.xpath("//span[@class ='rush-component']//h2"));
	    System.out.println("Total Number Of Bag Results :" + totalItemBag.getText());
	    WebElement safari = driver.findElement(By.xpath("(//div[@id = 'brandsRefinements']//a)[1]"));
	    safari.click();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    WebElement skyBag = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//a)[3]"));
	    skyBag.click();
	    driver.findElement(By.xpath("//span[@class = 'a-button-text a-declarative']//span[1]")).click();
		driver.findElement(By.xpath("//a[text() = 'Newest Arrivals']")).click();
		WebElement firstResultBag = driver.findElement(By.xpath("(//span[text()= '898']/ancestor::div[@class= 'a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]"));
		System.out.println("First Result Of Bag In List:" + firstResultBag.getText());
		String pageTitle = driver.getTitle();
        System.out.println("Current Page Title: " + pageTitle);
	    driver.close();
	}

}
