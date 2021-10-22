package JavaLearning;

import org.junit.Test;

import java.util.HashMap;

public class HashMapLearn {

    @Test
    public void test15(){
        HashMap<String,Integer> map = new HashMap<>();
        //we added key:value to hashmap
        map.put("Ricky",10);
        map.put("Bianca",7);
        map.put("Madi",36);
        //here we got size of array
        System.out.println("Size of HasMap : "+map.size());
        //lets get key values inside the map
        System.out.println("Key:Values inside HashMap :" + map);

        // if condition
        if(map.containsKey("Ricky")){
            int i =map.get("Ricky");
            System.out.println(" value for key "+ "Ricky"+ " is " + i);
        }


    }
}
