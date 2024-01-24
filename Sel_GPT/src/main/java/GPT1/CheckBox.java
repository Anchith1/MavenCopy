package GPT1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
public class CheckBox {
	 static WebDriver driver = null;
	 static WebDriverWait wait = null;

	 

	
	@BeforeTest
	public static void  CallPrevious() {
		gpt1 obj= new gpt1();
		driver = obj.MainLink();
		
	}
	
	//In a case where if it is not clciekd then lcick on it else leaev it 

	@Test
	public static void Checkbox() {
		 WebDriverWait wait  = new WebDriverWait(driver,20);
		 WebElement checkbox =  driver.findElement(By.xpath("//*[@href='/checkboxes']"));
		 checkbox.click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Checkboxes']")));
	}
		
		
	//	WebElement checkbox1 = driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
		//WebElement checkbox2 = driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
		
//		if( checkbox1.isSelected()) {
//			checkbox1.click();
//			System.out.println("Box1IsUnClicked");
//			
//		}
//		else {
//			checkbox1.click();
//			System.out.println("Box1IsClicked");
//		}
//		
//		if( checkbox2.isSelected()) {
//			checkbox2.click();
//			System.out.println("Box2IsUnClicked");
//			
//		}
//		else {
//			checkbox2.click();
//			System.out.println("Box2IsClicked");
//		}
//		
//
//		}
	@Test(dependsOnMethods="Checkbox")
	public static void checkboxclick() {
		List<WebElement> checkboxes= driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (WebElement checkbox:checkboxes) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				System.out.println("Ischecked");
			}
			else
			{
				checkbox.click();
				System.out.println("IsUnchecked");
				
			}
		}
		
	}
		 @AfterTest
		 public static void close1() {
			 driver.close();
			 driver.quit();


	}
}
