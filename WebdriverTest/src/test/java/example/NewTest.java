package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
  @Test(priority =1)
  public void getTitle() {
	  driver.get("http://www.guru99.com/selenium-tutorial.html");
	  String title=driver.getTitle();
	  System.out.println("Title is: "+title);
	  Assert.assertTrue(title.contains("Free Selenium Tutorials"));
  }
  
  @Test (priority=2)
  public void goHome(){
	  driver.findElement(By.ByXPath.xpath(".//*[@id='rt-header']/div/div[2]/div[1]/ul/li[1]/a")).click();
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("Meet Guru99"));
	  
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
