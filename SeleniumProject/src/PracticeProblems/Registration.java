package PracticeProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/CMCrandall191/CSET/Selenium/Driver/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.name("email_create")).sendKeys("robloxatme.com@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Charles");
		driver.findElement(By.id("customer_lastname")).sendKeys("Crandall");
		driver.findElement(By.name("passwd")).sendKeys("will11");
		
		driver.findElement(By.name("days")).sendKeys("27");
		driver.findElement(By.name("days")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.name("months")).sendKeys("j");
		driver.findElement(By.name("months")).sendKeys("j");
		driver.findElement(By.name("months")).sendKeys("j");
		driver.findElement(By.name("months")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.name("years")).sendKeys("2000");
		driver.findElement(By.name("years")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.name("company")).sendKeys("None");
		driver.findElement(By.name("address1")).sendKeys("20 Cherry Rd");
		driver.findElement(By.name("city")).sendKeys("Airville");
		
		driver.findElement(By.name("id_state")).sendKeys("p");
		driver.findElement(By.name("id_state")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.name("postcode")).sendKeys("17302");
		driver.findElement(By.name("phone_mobile")).sendKeys("717-381-1131");
		driver.findElement(By.name("alias")).sendKeys("20 Cherry Rd");
		driver.findElement(By.name("passwd")).sendKeys("will11");
		
		driver.findElement(By.name("SubmitAccount")).click();
		
		
	}
	
}
