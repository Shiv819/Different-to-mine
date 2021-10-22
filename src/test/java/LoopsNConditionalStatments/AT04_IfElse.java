package LoopsNConditionalStatments;

import org.junit.Test;

public class AT04_IfElse {
    @Test
    public void IfElseLoopLearn(){
        String browser="CHROME";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println(" test cases will be executed on chrome");
        }
        else
        {
            System.out.println(" test cases will be executed on FireFox");
        }
    }

}
