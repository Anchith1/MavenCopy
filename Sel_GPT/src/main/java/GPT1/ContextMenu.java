package GPT1;

import org.openqa.selenium.Alert;
//import org.apache.axis2.dataretrieval.DRConstants.SPEC.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ContextMenu {
	static WebDriver driver= null;
	static WebDriverWait wait = null;
	
	
	@BeforeTest 
	public static void PreSteps() {
			gpt1 obj= new gpt1();
			driver = obj.MainLink();
			WebElement contmenu =  driver.findElement(By.xpath("//*[@href='/context_menu']"));
			 contmenu.click();
			

			 
	}
	@Test
	
	public static void ContextMenu() throws InterruptedException {
		WebDriverWait wait  = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(), 'Context Menu')]")));
		 WebElement element = driver.findElement(By.id("hot-spot"));
		 Actions actions = new Actions(driver);
		 actions.contextClick(element).perform();
		 Alert switchalert = driver.switchTo().alert();
		 switchalert.accept();
		 

				
	}
	@AfterTest
	public static void QUit() {
		driver.close();
		driver.quit();
		
	}
}
