import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser
		// Chrome - ChromeDriver --> Methods close get
		// Firefox -FirefoxDriver -> Methods close get
		// WebDriver close get
		// WebDriver method + class methods
		
		// chromedriver.exe --> Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Synesis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// webdriver.chrome.driver --> value of path 
		//WebDriver driver = new ChromeDriver();
		// Firefox Launch
		// geckodriver
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Testing Tools\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Testing Tools\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver2.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getTitle());
		//System.out.println(driver.getPageSource());
		//driver.close();

	}
	

}



