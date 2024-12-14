package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAdvancedSearchSteps {
    WebDriver driver;

    @Given("^I am on Ebay Advanced Search Page$")
    public void i_am_on_ebay_advanced_search_page() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }

    @When("^I click on Ebay Logo$")
    public void i_click_on_ebay_logo() {
        driver.findElement(By.id("gh-logo")).click(); // Replace "gh-la" with the actual ID of the eBay logo
    }

    @Then("^I am navigated to Ebay Home Page$")
    public void i_am_navigated_to_ebay_home_page() {
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Did not navigate to the eBay home page", expectedUrl, actualUrl);
        driver.quit();
    }
}

