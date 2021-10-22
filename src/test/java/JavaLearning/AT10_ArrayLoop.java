package JavaLearning;

import org.junit.Test;

public class AT10_ArrayLoop {
    @Test
    public void test13(){
        int [] age ={10, 20, 30, 40, 50};
        //length of the array
        int i =age.length;
        System.out.println("length of array is : " + i);

        //for loop
        for(int j=0;j<i;j++){
            System.out.println("Array index : "+j+"  its value : "+age[j]);
        }

    }
}
