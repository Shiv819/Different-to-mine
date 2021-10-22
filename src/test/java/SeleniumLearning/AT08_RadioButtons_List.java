package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT08_RadioButtons_List {

    @Test
    public void RadioLearn() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options = new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver = new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("https://echoecho.com/htmlforms10.htm");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       List<WebElement> RadioList=driver.findElements(By.xpath("//input[@type='radio' and @name='radio1']"));
        int radioSiz=RadioList.size();
        System.out.println("radioSiz "+radioSiz);
        for (int i=0;i<radioSiz;i++){
            String AttVal=RadioList.get(i).getAttribute("type");
            System.out.println("AttVal "+AttVal);
            if(AttVal.equalsIgnoreCase("radio")){
                RadioList.get(i).click();
                break;

            }
        }
    }
}
