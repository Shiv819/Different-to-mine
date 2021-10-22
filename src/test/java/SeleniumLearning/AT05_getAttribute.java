package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT05_getAttribute {

    @Test
    public void LearnLocators() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options = new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver = new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("https://echoecho.com/htmlforms05.htm");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       String AttVal= driver.findElement(By.xpath("//input[@type='text' and @name='shorttext']")).getAttribute("name");
        System.out.println("Atrribute value of name is : " + AttVal);
       //driver.close();
      //  driver.quit();
    }
}