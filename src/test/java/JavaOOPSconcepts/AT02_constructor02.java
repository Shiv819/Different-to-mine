package JavaOOPSconcepts;

import org.junit.Test;

public class AT02_constructor02 {
@Test
    public void conMethod02(){
    //using constructor concept we created an object and called method from another class
    AT01_constructor01 obj = new AT01_constructor01();
    obj.conMethod01();

    // this sout belongs to this method
        System.out.println(" this is first constructor");
    }

}
