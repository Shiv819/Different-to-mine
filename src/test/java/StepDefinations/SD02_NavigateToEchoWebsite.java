package StepDefinations;

import CucumberScripts.AT01_NavigateToHNsite;
import CucumberScripts.AT02_NavigateToEchosite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD02_NavigateToEchoWebsite {
    @Given("Open the Browser and enter echourl and press enter key")
    public void open_the_browser_and_enter_echourl_and_press_enter_key() throws IOException {
        AT02_NavigateToEchosite.NavEchosite();
    }


}
