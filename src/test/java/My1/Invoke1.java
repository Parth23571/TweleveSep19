package My1;

//Tested s - 13-09-2019
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoke1 {
  @Test
  public void f() {
	  System.out.println("Test NG");
	  System.setProperty("webdriver.chrome.driver", "E:\\Browser\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  System.out.println("ReTesting ------------------- 4 --2 -1");
  try
  {
	  
  driver.get("http://newtours.demoaut.com/");
  driver.manage().window().maximize();
  System.out.println("Launched");
  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("hello");
  System.out.println("Entered Value Successfully");
  Thread.sleep(3000);
  driver.quit();
  }
  
  catch(Exception e)
  {
	  System.out.println("My Exception Test"+e.getMessage());
  }
  }
}
