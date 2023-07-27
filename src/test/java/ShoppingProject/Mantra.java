package ShoppingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mantra {
  @Test
  public void MantraTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening mantra", true);
	  driver.get("https://www.myntra.com/");
	  Thread.sleep(4000);
	  driver.close();
  }
}
