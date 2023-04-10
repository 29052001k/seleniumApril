package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/index.html");
		
		// locator by id
		
		WebElement q1=driver.findElement(By.id("One"));
		if(q1.getText().contains("It's selenium")) {
			System.out.println("test case pass 1"); 
		}
		
		// by class name
		
		WebElement q2=driver.findElement(By.className("Two"));
		
		if(q2.getText().contains("Paragraph")) {
			System.out.println("test case pass 2");
		}
		// by name
		
		WebElement q3=driver.findElement(By.name("nm"));
			
	if(q3.getText().contains("Paragraph")) {
		System.out.println("test case pass 3");
	}
		// by linkText
	
	WebElement q4=driver.findElement(By.linkText("facebook"));
		
	if(q4.isDisplayed()) {
		System.out.println("test case pass 4");
	}
	
		// by partial link text
	
	WebElement q5=driver.findElement(By.partialLinkText("book"));
	
	if(q5.isDisplayed()) {
		System.out.println("test case pass 5");
	}
	
		// byTagName
	
WebElement q6=driver.findElement(By.tagName("h2"));
	
	if(q6.isDisplayed()) {
		System.out.println("test case pass 6");
	}
		// by xpath
	
WebElement q7=driver.findElement(By.xpath("/html/body/p[1]"));
	
	if(q7.isDisplayed()) {
		System.out.println("test case pass 7");
	}
		// by css
	
WebElement q8=driver.findElement(By.cssSelector("h2[id='One']"));
	
	if(q8.isDisplayed()) {
		System.out.println("test case pass 8");
	}
	
	driver.quit();
	}

}
