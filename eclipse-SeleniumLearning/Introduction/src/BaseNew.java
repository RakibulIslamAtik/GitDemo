import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Testing Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String [] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Mushroom"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
//		BaseNew b = new BaseNew();
//		b.addItems(driver, itemsNeeded);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	


	}
	
	public static void addItems(WebDriver driver, String [] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			// Brocolli - 1 kg
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName =  name[0].trim();
			// Format it to get actual vegetables name
			// Convert array to arrayList for easy search
			// Check whether the name we extracted is present in arrayList or not--
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if(itemsNeededList.contains(formattedName)) {
				j++;
				// click on Add to cart
				//  //button[text()='ADD TO CART']
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
				}
				
				
			}
		}
		
	}
	
	
	

}
