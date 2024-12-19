package testRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.99.141:3000/");
	
	WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
	username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("Shiva@1919");
	
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[text()='Logout']")).click();
	System.out.println("Successful");
	driver.quit();
	
	}

}
