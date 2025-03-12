package kent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void mavencheck() {
		Reporter.log("mavencheck",true);
		WebDriver driver= new ChromeDriver();
		driver.get("https://bbb.com");
		String title=driver.getTitle();
		Reporter.log(title,true);
	}

}
