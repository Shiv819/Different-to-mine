package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import excelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT12_ExcelUsage {

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
        driver.get("https://www.harveynorman.com.au/customer/account/create/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //location of excel file
        Xls_Reader reader = new Xls_Reader("D:\\SeleniumMaterial-StudentsDistribution\\06_DataDrivenTesting\\05_SeleniumParameterization\\TestDataHN1.xlsx");
        Xls_Reader xls_reader = new Xls_Reader(ReadPropertiesFile.PropFile("ExcelData"));
        int rowcount =reader.getRowCount("RegTestData");
        for(int j=2;j<=rowcount;j++){

            //get username
            String username=reader.getCellData("RegTestData","FirstName",j);
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys(username);
            //get lastname
            String lastname=reader.getCellData("RegTestData","LastName",j);
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys(lastname);
            // email
            String EmailAddress =reader.getCellData("RegTestData","EmailAddress",j);
            driver.findElement(By.id("email_address")).clear();
            driver.findElement(By.id("email_address")).sendKeys(EmailAddress);
           //password
            String Password=reader.getCellData("RegTestData","Password",j);
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(Password);
            //re-enter password
            String RePassword=reader.getCellData("RegTestData","RePassword",j);
            driver.findElement(By.id("confirmation")).clear();
            driver.findElement(By.id("confirmation")).sendKeys(RePassword);
            reader.setCellData("RegTestData","Result",j,"PASS");

        }



    }
}