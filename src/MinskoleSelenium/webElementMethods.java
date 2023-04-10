package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		
//		WebElement FirstName=driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
//		WebElement LastName=driver.findElement(By.cssSelector("input[name=\"last_name\"]"));
//		WebElement email=driver.findElement(By.cssSelector("input[name=\"email\"]"));
//		WebElement comment =driver.findElement(By.cssSelector("textarea[name=\"message\"]"));
//		WebElement submit=driver.findElement(By.cssSelector("input[type=\"submit\"]"));
//		WebElement h2=driver.findElement(By.tagName("h2"));
//		
//		if(h2.isDisplayed()) {
//			System.out.println("test case is pass");
//		}else {
//			System.out.println("test case fail");
//		}
		
		
		// sendKeys() [input/textarea]
		
//		FirstName.sendKeys("Kalyani");
//		LastName.sendKeys("Hadole");
//		email.sendKeys("kalyanihadole@gmail.com");
//		comment.sendKeys("It's my first case in seleium");
//		//submit.click();
		
		// submit()
		//submit.submit();
		
		
		// program 2
		
		// isselected()/isEnabled()
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		System.out.println(driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isEnabled());
		
		driver.quit();
	
	}

}
