package LoopsNConditionalStatments;

import org.junit.Test;

public class AT05_ElseIf {
    @Test
    public void ElseIfLoopLearn(){
        String browser="FireFox1";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println(" test cases will be executed on chrome");
        }
        else if(browser.equalsIgnoreCase("IE")){

            System.out.println(" test cases will be executed on IE");
        }
        else if(browser.equalsIgnoreCase("FireFox")){

                    System.out.println(" test cases will be executed on FireFox");
                }
                else
                {
                    System.out.println("Browser is not in the list");
                }
    }

}
