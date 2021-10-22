package JavaOOPSconcepts;

import org.junit.Test;

public abstract class AT13_AbstractClass01 {

    //we know the logic for this below method
    @Test
    public void sumNum(){
        int x=10;
        int y=20;
        System.out.println("addation of 2 number is : " +(x+y));

    }
    //we know the logic for this below method
    @Test
    public void subNum(){
        int x=100;
        int y=20;
        System.out.println("sub of 2 number is : " +(x-y));

    }
    //we dont know the logic for this below method
    @Test
    public abstract void divNum();

}
