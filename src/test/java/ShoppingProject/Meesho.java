package ShoppingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void MeeshoTest () throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening Meesho", true);
	  driver.get("https://www.meesho.com/");
	  Assert.fail();
	  Thread.sleep(4000);
	  driver.close();
  }
}
