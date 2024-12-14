package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHomeSteps {

    WebDriver driver;

    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }

    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        driver.findElement(By.linkText("Advanced")).click();
    }
    @Then("I navigate to the Advanced Search page")
    public void i_navigate_to_the_advanced_search_page() {
        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearch";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("It did not navigate to the expected page", expectedUrl, actualUrl);

        driver.quit();
    }
}
