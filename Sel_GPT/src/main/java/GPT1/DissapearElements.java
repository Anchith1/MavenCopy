package GPT1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DissapearElements {


		static WebDriver driver=null;
	@Test 
		public static void Initialstep() {
		gpt1 obj =new gpt1();
		driver=obj.MainLink();
		
			
		}
	}


}
