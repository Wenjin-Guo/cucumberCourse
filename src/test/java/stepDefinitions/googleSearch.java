//package stepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.safari.SafariDriver;
//
//import java.time.Duration;
//
//public class googleSearch {
//    SafariDriver driver = new SafariDriver();
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside step - browser is on");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//    }
//    @And("user is on google search page")
//    public void user_is_on_google_search_page() {
//        System.out.println("Inside step - user is on google search");
//        driver.get("https://www.google.com");
//    }
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() {
//        System.out.println("Inside step - user enters a text in search box");
//        driver.findElement(By.name("q")).sendKeys("wenjin guo");
//    }
//    @And("hits enter")
//    public void hits_enter() {
//        System.out.println("Inside step - user hit enter");
//        driver.findElement(By.name("q")).click();
//    }
//    @Then("user is navigated to search results")
//    public void user_is_navigated_to_search_results() {
//        System.out.println("Inside step - user is navigated to the result");
//        driver.getPageSource().contains("target");
//        driver.close();
//    }
//
//}
