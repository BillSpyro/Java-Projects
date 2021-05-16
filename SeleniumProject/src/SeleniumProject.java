import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/CMCrandall191/CSET/Selenium/Driver/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("imdb");

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//div[@class='yuRUbf']")).click();
        driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
        
      Thread.sleep(2000);
      
      	//Link text accesses text on page
        driver.findElement(By.linkText("Most Popular Movies")).click();
        WebElement a = driver.findElement(By.xpath("//table//tr[3]//td[2]"));
        System.out.println(a.getText());
        
        driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys("arnold schwarzenegger");
        driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys(Keys.RETURN);
        driver.findElement(By.linkText("Arnold Schwarzenegger")).click();
        List<WebElement> b =   driver.findElements(By.xpath("//div[@class='filmo-row odd']"));
     System.out.println(b.get(2).getText());
	}

}
