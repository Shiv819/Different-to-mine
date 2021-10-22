package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT009_IsEnabled {

    @Test
    public void enabled() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options=new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver=new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        if(driver.findElement(By.xpath("//button[@name='send']")).isEnabled())
        {
            System.out.println("button is enabled");
        }
        else
        {
            System.out.println("button is disabled");
        }


}
}
