import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/CMCrandall191/CSET/Selenium/Driver/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_g")).click();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Charles");
		
		driver.findElement(By.id("lastName")).sendKeys("Crandall");
		
		driver.findElement(By.name("Username")).sendKeys("CharlesCrandall2000");
		driver.findElement(By.name("Passwd")).sendKeys("NoneOfYourBusiness");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("NoneOfYourBusiness");
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("7173811131");
		driver.findElement(By.name("Phone number")).sendKeys("7173811131");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}
	
}
