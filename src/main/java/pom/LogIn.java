package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
	
	//decleration 
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	private WebElement un;
	private WebElement pwd;
	private WebElement loginbutton;
	static WebDriver driver;
	
	//initilization 
	public LogIn(WebDriver driver) {
		this.driver=driver;
		un=driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[1]"));
		pwd=driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[2]"));
		loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
	}
	
	//Useges 
	public void orangeHRMusername() {
		un.sendKeys("Admin");
		
	}
	
	public void orangeHRMuserpwd() {
		pwd.sendKeys("admin123");
	}
	public void login() {
		loginbutton.click();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeBrowser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LogIn l=new LogIn(driver);
		l.orangeHRMusername();
		l.orangeHRMuserpwd();
		l.login();
		
	}
  

}
