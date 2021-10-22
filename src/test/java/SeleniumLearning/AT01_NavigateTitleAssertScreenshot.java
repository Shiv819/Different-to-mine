package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavHN() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options=new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver=new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("https://www.harveynorman.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get title
        String ActualTitle =driver.getTitle();
        System.out.println("title of HN homepage is : "+ActualTitle);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
    //Assertion
        Assert.assertEquals(ExpectedTitle,ActualTitle);

        //another version of assert
        Assert.assertTrue(ActualTitle.contains("Computers"));

        //screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));
    }
}
