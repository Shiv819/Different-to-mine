package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        int l =obj.envMethod01(10,20);
        int m=obj.envMethod02(90,90);
        System.out.println("L+M value is " +(l+m));


    }




}
