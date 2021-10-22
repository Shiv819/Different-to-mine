package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn(){
        int ticket =75;
        do{
            System.out.println("current ticket number is : "+ ticket);
            ticket++;
        }while(ticket<80);
    }
}
