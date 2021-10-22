package CucumberScripts;

import BaseClass.OpenBrowser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AT01_NavigateToHNsite {
    @Test
    public static void NavHNsite() throws IOException {
        OpenBrowser.NavToWebsite("Ecomurl");
    }

    @Test
    public static void assertHomepage(){
       String ActualTitle= OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle = "Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        //assertequals
        Assert.assertEquals(ExpectedTitle, ActualTitle);


    }
}
