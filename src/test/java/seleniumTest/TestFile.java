package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestFile {
@Test
public void login()
{
	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("http://www.google.com/");	
}
}
