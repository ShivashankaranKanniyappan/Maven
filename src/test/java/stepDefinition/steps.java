package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class steps {

	WebDriver driver = new EdgeDriver();
	
	@Given("User should be in login Page")
	public void userShouldBeInLoginPage() {
		driver.manage().window().maximize();
		driver.get("http://192.168.99.141:3000/");
	}
	@When("User Enter Username and Password")
	public void userEnterUsernameAndPassword() {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Shiva@1919");
	}
	@When("User should click the LoginButton")
	public void userShouldClickTheLoginButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(5000);
	}
	@Then("Login Should be successful")
	public void loginShouldBeSuccessful() {
	    System.out.println("Login successful");
	}




}
