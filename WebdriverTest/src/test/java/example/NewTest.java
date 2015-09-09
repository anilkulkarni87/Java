package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
  @Test
  public void testEasy() {
	  driver.get("http://www.guru99.com/selenium-tutorial.html");
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertTrue(title.contains("Free Selenium Tutorials"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
