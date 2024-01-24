package GPT1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anchith\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		
	}

}
