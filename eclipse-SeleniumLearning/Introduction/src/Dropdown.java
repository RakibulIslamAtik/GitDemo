import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Testing Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//	//a[@value='MAA'] -- Xpath for Chennai
		// 	//a[@value='BLR'] -- Xpath for Bengaluru
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		//  --------- Xpath by using index
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// ---------- Xpath for parent to child technique 
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();
		
		// ctl00_mainContent_ddl_destinationStation1_CTXT
		// ctl00_mainContent_ddl_originStation1_CTXT
		
		
		
		
		

	}

}
