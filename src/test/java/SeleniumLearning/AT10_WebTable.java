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

public class AT10_WebTable {

    @Test
    public void table() throws IOException, InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options=new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver=new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("file:///D:/SeleniumMaterial-StudentsDistribution/04_SeleniumLearning/10_WebTables/webtablehtml.html");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //get count of columns
        List <WebElement> colcount= driver.findElements(By.xpath("/html/body/table/thead/tr/th"));
        int colsize=colcount.size();
        System.out.println("colsize : "+colsize);

        //Thread.sleep(3000);

        //get row count
        List <WebElement> rowcount = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        System.out.println(rowcount.size());

        //Row1, column2 cell value print (Print particular cell value)
        WebElement CellVal= driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[1]/td[2]"));
        System.out.println("print specific cell value : "+CellVal.getText() );

        //To print all the values in the row which has header as "clock tower hotel"
        String sRowVal="Clock Tower Hotel";
        //Count headings in first column
        List <WebElement> headercount = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        int NumCells= headercount.size(); //size 4

        //get count for row 2
        List <WebElement> row2Count = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
        int RowSize= row2Count.size(); //size 6

        for(int i=1;i<=NumCells;i++)
        {
            //print headers in column one untill it matches with "Clock Tower Hotel"
            String sVal=driver.findElement((By.xpath("/html/body/table/tbody/tr["+i+"]/th"))).getText();
            System.out.println("this is : " +sVal);
            if(sVal.equalsIgnoreCase(sRowVal))
            {
                for(int j=1;j<=RowSize;j++)
                {
                 WebElement textValue=driver.findElement((By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")));
                  String RowData=  textValue.getText();
                    System.out.println("text contained inside row is : " + RowData);

                }

                break;
//
            }
        }







}
}
