package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert
		
//		driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
//		
//		org.openqa.selenium.Alert a =driver.switchTo().alert();
//		driver.switchTo().alert().accept();
//		
//		String txt=driver.findElement(By.id("result")).getText();
//		
//		if(txt.equals("You successfully clicked an alert")) {
//			System.out.println("test case pass 1");
//		}else {
//			System.out.println("test case fail 1");
//		}
		
		// Confirm
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//	
//	driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
//	org.openqa.selenium.Alert alert = driver.switchTo().alert();
//	driver.switchTo().alert().accept();
//	String txt = driver.findElement(By.id("result")).getText();
//	if(txt.equals("You clicked: Ok")) {
//		System.out.println("Testcase pass");
//	}
//	else {
//		System.out.println("Testcase fail");
//	}
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		driver.switchTo().alert().dismiss();
//		String txt = driver.findElement(By.id("result")).getText();
//		if(txt.equals("You clicked: Cancel")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
		
		// prompt
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		String txt = 	"Kalyani";
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
//		driver.switchTo().alert().sendKeys(txt);
//		driver.switchTo().alert().accept();
//		String text = driver.findElement(By.id("result")).getText();
//		if(text.contains(txt)) {
//			System.out.println("Test case pass");
//		}
//		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.id("result")).getText();
		if(text.contains(text)) {
			System.out.println("Test case pass");
		}
	
}
}