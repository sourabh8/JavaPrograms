package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

    public static void main(String args[]){

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Sourabh");
        map.put(2,"Rahul");
        map.put(3,"Sachin");
        map.put(4,"Sehwag");

        //traversing through map.entrset for each loop
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"--->"+m.getValue());
        }
    }
}
