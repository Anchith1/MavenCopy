package GPT1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ADDDEL {
	
	static WebDriver driver= null;
	static WebDriverWait wait = null;
	public static void AdRemove() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1.heading")));
	//System.out.println("ITisVisible");
	//click on link
	WebElement Aremove = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));
	Aremove.click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@onclick='addElement()']")));
	System.out.println("printed");
	WebElement Addd = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
	Addd.click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@onclick='deleteElement()']")));
	WebElement remove = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
	remove.click();
	System.out.println("printagain");
	Addd.click();
	
	}

	public static void main(String[] args) throws InterruptedException {
		gpt1 obj =new gpt1();
		driver = obj.MainLink();
		
		AdRemove();
		
		driver.close();
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}
	

}
