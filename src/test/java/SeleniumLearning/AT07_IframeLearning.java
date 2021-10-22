package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT07_IframeLearning {

    @Test
    public void LearnLocators() throws IOException, InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options = new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver = new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("https://www.harveynorman.com.au/signup");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1st method
        //  driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        //enter data into first name field
        //driver.findElement(By.id("firstName")).sendKeys("test");

        //2nd method
        List<WebElement> listofFrames = driver.findElements(By.tagName("iframe"));
        int iframeSize = listofFrames.size();
        System.out.println("Iframe count is : " + iframeSize);
        for (int i = 0; i < iframeSize; i++) {
            driver.switchTo().frame(i);
            driver.findElement(By.id("firstName")).sendKeys("test");
            driver.findElement(By.id("emailId")).sendKeys("test");
            break;
        }
        System.out.println("test");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //switch back to main screen
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Harvey Norman - Computers & Tablets']")).click();


        //another way
//        WebElement frm= driver.findElement(By.xpath("//iframe[@class='mobSubscribe ']"));
//        driver.switchTo().frame(frm);
//
//        driver.findElement(By.id("firstName")).sendKeys("test");
//        System.out.println("Sign up frame has been found");
//        driver.switchTo().defaultContent();
    }
}