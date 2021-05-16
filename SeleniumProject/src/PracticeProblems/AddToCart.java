package PracticeProblems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/CMCrandall191/CSET/Selenium/Driver/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.name("email")).sendKeys("robloxatme.com@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("will11");
		driver.findElement(By.name("SubmitLogin")).click();
		
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php?id_category=11&controller=category");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("selectProductSort")).sendKeys("p");
		driver.findElement(By.className("selectProductSort")).sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php?controller=cart&add=1&id_product=7&token=4dde8899b51209ccaae4fd9687859b77");

		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php");
		
	}
	
}
