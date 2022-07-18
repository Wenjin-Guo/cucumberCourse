package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class logInSteps {
    WebDriver driver = null;
    @Given("browser is open")
    public void browser_is_open() {
        driver = new SafariDriver();
    }
    @And("User is on login page")
    public void user_is_on_login_page() {
        driver.get("https://example.testproject.io/web/");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("name")).sendKeys("Raghav");
        driver.findElement(By.id("password")).sendKeys("12345");
    }
    @And("user click on login")
    public void user_click_on_login() {
        driver.findElement(By.id("login")).click();
    }
    @Then("user is navigate to the home page")
    public void user_is_navigate_to_the_home_page() {
        driver.findElement(By.id("logout")).isDisplayed();
        driver.close();
    }
}
