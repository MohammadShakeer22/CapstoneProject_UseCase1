package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ABTestingSteps {
    WebDriver driver;

    @Given("I launch the URL {string}")
    public void i_launch_the_URL(String url) {
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver.get(url);
    }

    @Then("I verify the title is {string}")
    public void i_verify_the_title_is(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    @When("I click on {string} link")
    public void i_click_on_link(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Then("I verify the page text is {string}")
    public void i_verify_the_page_text_is(String expectedText) {
        String actualText = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @When("I navigate back to Home page")
    public void i_navigate_back_to_home_page() {
        driver.navigate().back();
    }

    @When("I click on link {string}")
    public void i_click_on(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @When("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String option) {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[text()='" + option + "']")).click();
    }

    @Then("I confirm {string} is selected")
    public void i_confirm_is_selected(String option) {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        String selectedOption = dropdown.findElement(By.cssSelector("option:checked")).getText();
        Assert.assertEquals(selectedOption, option);
    }

    @When("I click on {string}")
    public void i_click_on_frames(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Then("I verify the hyperlinks {string} and {string} are present")
    public void i_verify_the_hyperlinks_are_present(String link1, String link2) {
        Assert.assertTrue(driver.findElement(By.linkText(link1)).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(link2)).isDisplayed());
        driver.quit();
    }
}
