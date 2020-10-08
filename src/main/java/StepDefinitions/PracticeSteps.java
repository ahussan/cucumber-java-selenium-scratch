package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static StepDefinitions.PracticeLocators.*;

public class PracticeSteps {

    public WebDriver driver;

    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(TEST_URL.get());
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("^I navigate to test site$")
    public void navigate_to_test_site(){
        driver.get(TEST_URL.get());
    }

    @Given("^I should be on testing site$")
    public void i_should_be_on_testing_site() throws InterruptedException {
        Thread.sleep(5000);
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.equalsIgnoreCase("ToolsQA"));
    }

    @When("^I enter first name as \"([^\"]*)\"$")
    public void i_enter_first_name(String option) {
        driver.findElement(By.xpath(FIRST_NAME_XPATH.get())).sendKeys(option);
    }

    @When("^I enter last name as \"([^\"]*)\"$")
    public void i_enter_last_name(String option) {
        driver.findElement(By.xpath(LAST_NAME_XPATH.get())).sendKeys(option);
    }

    @When("I enter email as \"([^\"]*)\"$")
    public void i_enter_email(String option) {
        driver.findElement(By.xpath(EMAIL_XPATH.get())).sendKeys(option);
    }

    @When("I choose male")
    public void i_choose_male(){
        WebElement element = driver.findElement(By.xpath(GENDER_XPATH.get()));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
    }

    @When("I enter phone number as \"([^\"]*)\"$")
    public void i_enter_phone_number(String option) {
        driver.findElement(By.xpath(PHONE_XPATH.get())).sendKeys(option);
    }

    @When("I check checkbox sports")
    public void i_click_sports(){
        WebElement element = driver.findElement(By.xpath(SPORTS_XPATH.get()));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
    }

    @When("I enter subjects as \"([^\"]*)\"$")
    public void i_enter_subjects(String option) {
        driver.findElement(By.xpath(SUBJECTS_XPATH.get())).sendKeys(option);
        WebElement stateBox = driver.findElement(By.xpath(SUBJECTS_XPATH.get()));
        stateBox.sendKeys(Keys.ENTER);
    }

    @When("I enter address as \"([^\"]*)\"$")
    public void i_enter_address(String option) {
        driver.findElement(By.xpath(ADDR_XPATH.get())).sendKeys(option);
    }

    @When("I select state as NCR")
    public void i_select_state() {
        driver.findElement(By.xpath(STATE_XPATH.get())).sendKeys("NCR");
        WebElement stateBox = driver.findElement(By.xpath(STATE_XPATH.get()));
        stateBox.sendKeys(Keys.ENTER);
    }

    @When("I select city as Delhi")
    public void i_select_city(){
        driver.findElement(By.xpath(CITY_XPATH.get())).sendKeys("Delhi");
        WebElement stateBox = driver.findElement(By.xpath(CITY_XPATH.get()));
        stateBox.sendKeys(Keys.ENTER);
    }

    @When("I click on submit")
    public void i_click_submit(){
        WebElement element = driver.findElement(By.xpath(SUBMIT_XPATH.get()));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",element);
    }

    @Then("I verify pop up window exists")
    public void i_verify_pop_up() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath(CLOSE_BUTTON_XPATH.get())).isDisplayed());
    }
}
