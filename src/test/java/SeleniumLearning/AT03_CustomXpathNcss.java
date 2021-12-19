package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT03_CustomXpathNcss {

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
        //Custom xpath
        //1st method
       // driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("test");
    //   driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("king");
//2nd method

       //driver.findElement(By.xpath("//a[contains(@title,'Harvey Norman - Scam Alert')]")).click();

        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div/ul/li[7]/ul/li[3]/ul[1]/li[1]/ul/li[2]/a")).click();

        //driver.findElement(By.xpath("#wrapper > div.main-nav-wrapper > div.container > div > div > ul > li:nth-child(8) > ul > li.nav-hover > ul:nth-child(1) > li:nth-child(1) > ul > li:nth-child(2) > a")).click();
    }
    //3rd method
    //a[starts-with(@title,'Harvey Norman B')]
    //4ht method
    //a[contains(text(),'Safe Shopping')]
    //a[contains(text(),'Help & Support')]
    //5th method
    //a[@title='Harvey Norman - FAQs' and @class='tracked']

    //css
    //1st method

}