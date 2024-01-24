package GPT1;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import com.beust.jcommander.internal.Lists;

public class BrokenIMG {
	private static WebDriver driver = null;
	private static WebDriverWait wait=null;
	
	
	@BeforeTest
	
	public static void Setup() {
		gpt1 obj = new gpt1();
		driver = obj.MainLink();
		
	}
	
	@Test
	
	public static void BrokenImg1() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		WebElement BrokenImg = driver.findElement(By.xpath("//a[@href='/broken_images']"));  //
		BrokenImg.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(), 'Broken Images')]")
));
		System.out.println("Button Present");
	
		}
		@Test (dependsOnMethods="BrokenImg1",dataProvider = "srcDataProvider")
			
			public static void BrokenImg2(String srcvar) {
			for(int i=0; i<2;i++) {
			WebElement img1 = driver.findElement(By.xpath("//img[@src='" + srcvar + "']"));
			String src = img1.getAttribute("src");
			System.out.println(src);
			driver.get(src);
			WebElement headingb =driver.findElement(By.xpath("//h1[contains(text(), 'Not Found')]")
					);
			if(headingb !=null) {
				System.out.println("Broken-Img");
			}
			else
			{ System.out.println("Not-BrokenImg");
			}
			}
			}
				
				
			
			 @DataProvider(name = "srcDataProvider")
			    public Object[][] srcDataProvider() {
			        return new Object[][]{
			                {"asdf.jpg"},
			                {"hjkl.jpg"},
			                {"img/avatar-blank.jpg"}
			        };
			}
			
			
			
				
			
		
		
		
		
		 @AfterTest
		 public static void close1() {
			 driver.close();
			 driver.quit();
	}
	
	
}
