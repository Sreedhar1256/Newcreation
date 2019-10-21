import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String alertMessage = "";

//		System.setProperty("webdriver.firefox.marionette", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		try {
			driver.get("https://www.google.com");
			driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
			
	        Thread.sleep(200);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			Thread.sleep(2000);
//			driver.close();
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
