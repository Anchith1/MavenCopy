package GPT1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gpt1 {
	private static WebDriver driver;
	private static WebDriver wait;

		public WebDriver MainLink() {
			if (driver == null) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anchith\\Desktop\\chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/");
		 WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1.heading")));
			System.out.println("ITisVisible");
 
		
			}
			return driver;
		
		}
	
}
