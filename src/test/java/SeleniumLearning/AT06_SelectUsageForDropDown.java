package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT06_SelectUsageForDropDown {

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
        driver.get("https://www.harveynorman.com.au/acer-nitro-5-15-6-inch-i5-11300h-8gb-512gb-ssd-gtx1650-4gb-laptop.html");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select Dropdownlist = new Select(driver.findElement(By.id("select_999999900")));
        int DrpDwnSiz=Dropdownlist.getOptions().size();
        System.out.println("Drop down list size : " + DrpDwnSiz);
        //1st method
      //  Dropdownlist.selectByVisibleText("3 years Product Care Replacement");
        //2nd method
       // Dropdownlist.selectByIndex(2);

        //3rd method
       // Dropdownlist.selectByValue("2000001549~24~249.0000~C~PRODUCT CARE REPLACE 062");
        System.out.println("test00");
        // how to use it in for loop
        for (int i=0;i<DrpDwnSiz;i++){
            System.out.println("test01");
            String DrpDwnVal=Dropdownlist.getOptions().get(i).getText();
            System.out.println("drop down value is :" + DrpDwnVal);
            if(DrpDwnVal.equalsIgnoreCase("3 years Product Care Replacement")){
                //Dropdownlist.getOptions().get(i).click();
                Dropdownlist.selectByIndex(i);
                break;
            }
        }
    }
}