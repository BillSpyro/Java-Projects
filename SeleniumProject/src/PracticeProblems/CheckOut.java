package PracticeProblems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOut {

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
		
		driver.get("http://automationpractice.com/index.php?controller=cart&add=1&id_product=7&token=4dde8899b51209ccaae4fd9687859b77");

		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php?controller=cart&add=1&id_product=7&ipa=34&id_address_delivery=451904&token=4dde8899b51209ccaae4fd9687859b77");
		
		Thread.sleep(2000);
		
		driver.get("http://automationpractice.com/index.php?controller=order&step=1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("processAddress")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("cheque")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit'][@class='button btn btn-default button-medium']")).click();
		
		Thread.sleep(2000);
		
		WebElement a = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		System.out.println(a.getText());
		driver.findElement(By.xpath("//a[@title='Back to orders'][@class='button-exclusive btn btn-default']")).click();
		
		Thread.sleep(2000);
		
		 a = driver.findElement(By.className("color-myaccount"));
		System.out.println("Order Reference: " + a.getText());
		
		a = driver.findElement(By.className("history_price"));
		System.out.println("Total Price: " + a.getText());
		
		a = driver.findElement(By.xpath("//table//tbody//tr[1]//td[5]"));
		System.out.println("Status: " + a.getText());
		
		driver.findElement(By.className("logout")).click();
	}
	
}
