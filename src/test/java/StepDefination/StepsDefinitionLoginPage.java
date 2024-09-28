package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinitionLoginPage {
	
static WebDriver driver;


@Given("User is on login page")
public void user_is_on_login_page() {
    driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	
	
	
	
	
}

@When("User enters valid UserName and PassWord")
public void user_enters_valid_user_name_and_pass_word() {
   driver.findElement(By.id("inputUsername")).sendKeys("Krushna Honrao");
   driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

   
}

@And("Click on the Login Button")
public void click_on_the_login_button() {
   driver.findElement(By.className("signInBtn")).click();

}

@Then("User is Navigate to Home Page")
public void user_is_navigate_to_home_page() {
    String loginpage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText();
    Assert.assertEquals(loginpage, "You are successfully logged in.");		
	
}

@And("Close the Browser")
public void close_the_browser() {
	driver.close();
  
}



}
