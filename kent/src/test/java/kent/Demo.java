package kent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	public void mavencheck() {
		Reporter.log("mavencheck",true);
		driver= new ChromeDriver();
		driver.get("https://bbb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title=driver.getTitle();
		Reporter.log(title,true);
		driver.quit();
		
		
	}

}
