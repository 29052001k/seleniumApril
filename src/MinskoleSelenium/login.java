package MinskoleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\Desktop\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		Boolean logo=driver.findElement(By.cssSelector("img[alt=\"client brand banner\"]")).isDisplayed();
		
		if(logo) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
		
		
		
		
	
	}

}
