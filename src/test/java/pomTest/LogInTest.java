package pomTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.LogIn;

public class LogInTest {
	
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
	
	@Test
    public void test() {
    	
    }
	

}
