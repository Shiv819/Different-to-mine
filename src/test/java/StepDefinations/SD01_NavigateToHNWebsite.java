package StepDefinations;

import CucumberScripts.AT01_NavigateToHNsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNWebsite {

    @Given("Open the Browser and enter url and press enter key")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_NavigateToHNsite.NavHNsite();
    }
    @Then("System should navigate to HomePage of HN website")
    public void system_should_navigate_to_home_page_of_hn_website() {

        AT01_NavigateToHNsite.assertHomepage();
    }
}
