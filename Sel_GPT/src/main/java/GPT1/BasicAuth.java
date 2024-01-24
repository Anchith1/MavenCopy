package GPT1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAuth {
	//@SuppressWarnings("unused")
	 static WebDriver driver= null;
	 //static WebDriverWait wait = null;
	 
	 @BeforeTest
	 public  void Setup() {
		 gpt1 obj = new gpt1();
		 driver = obj.MainLink();
		 
		 
	 }
	 @Test 
	 public static void Login() {
		 WebDriverWait wait  = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@href='/basic_auth']")));
			 WebElement Basicauth = driver.findElement(By.xpath("//*[@href='/basic_auth']"));
			 Basicauth.click();
			 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(text(), 'Congratulations! You must have the proper credentials.')]\r\n"
			 		+ ""
)));
			 System.out.println("workDoneWell");
			 
		 
	 }

	 
	 @AfterTest
	 public static void close1() {
		 driver.close();
		 driver.quit();
	 }

	
		 
		 
	 }
	 
	 



