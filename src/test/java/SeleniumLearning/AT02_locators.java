package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_locators {

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
        driver.get("https://www.harveynorman.com.au");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //id
        //driver.findElement(By.id("firstname")).sendKeys("test");
        //name
       // driver.findElement(By.name("lastname")).sendKeys("test");
        //tag
       // driver.findElement(By.tagName("input")).sendKeys("test");
        //link text
       // driver.findElement(By.linkText("Newsletter sign up")).click();
        //partial link text
        //driver.findElement(By.partialLinkText("Newsletter")).click();
        //css
      //  driver.findElement(By.cssSelector("#header > div.masthead_top > div > ul > li:nth-child(6) > a")).click();
    //xpath
    //    driver.findElement(By.xpath("//*[@id='category-grid']/div[2]/div/div[3]/a")).click();

    }
}