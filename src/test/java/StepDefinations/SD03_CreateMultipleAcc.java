package StepDefinations;

import BaseClass.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD03_CreateMultipleAcc {

    @Given("Navigate to Registartion screen on HN website")
    public void navigate_to_registartion_screen_on_hn_website() throws InterruptedException, IOException {
        OpenBrowser.NavToWebsite("CreAcc");
        Thread.sleep(1000);
    }
    @Then("Customer enter firstname as {string}")
    public void customer_enter_firstname_as(String FirstName) {
        OpenBrowser.driver.findElement(By.cssSelector("#firstname")).sendKeys(FirstName);
    }
    @Then("Customer enter lastname as {string}")
    public void customer_enter_lastname_as(String LastName) {
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys(LastName);
    }
    @Then("Customer enter emailadd as {string}")
    public void customer_enter_emailadd_as(String EmailAdd) {
        OpenBrowser.driver.findElement(By.id("email_address")).sendKeys(EmailAdd);
    }
    @Then("Customer enter Pass as {string}")
    public void customer_enter_pass_as(String Passwd) {
        OpenBrowser.driver.findElement(By.id("password")).sendKeys(Passwd);
    }
    @Then("Customer enter repass as {string}")
    public void customer_enter_repass_as(String RePasswd) {
        OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys(RePasswd);
    }
}
