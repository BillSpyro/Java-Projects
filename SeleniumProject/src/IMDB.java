import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMDB {
	

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
        driver.findElement(By.linkText("Top Rated Movies")).click();
        
        WebElement a = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
        WebElement b = driver.findElement(By.xpath("//table//tr[1]//td[3]"));
        System.out.println(a.getText());
        System.out.println(b.getText());
        
        a = driver.findElement(By.xpath("//table//tr[2]//td[2]"));
        b = driver.findElement(By.xpath("//table//tr[2]//td[3]"));
        System.out.println(a.getText());
        System.out.println(b.getText());
        
        a = driver.findElement(By.xpath("//table//tr[3]//td[2]"));
        b = driver.findElement(By.xpath("//table//tr[3]//td[3]"));
        System.out.println(a.getText());
        System.out.println(b.getText());
        
        a = driver.findElement(By.xpath("//table//tr[4]//td[2]"));
        b = driver.findElement(By.xpath("//table//tr[4]//td[3]"));
        System.out.println(a.getText());
        System.out.println(b.getText());
        
        a = driver.findElement(By.xpath("//table//tr[5]//td[2]"));
        b = driver.findElement(By.xpath("//table//tr[5]//td[3]"));
        System.out.println(a.getText());
        System.out.println(b.getText());
}
}