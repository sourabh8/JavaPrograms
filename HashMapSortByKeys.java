package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortByKeys {
    public static  void  main(String args[]){

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(11,"Sourabh");
        map.put(2,"Saheb");
        map.put(33,"Sujay");
        map.put(4,"Akash");
        map.put(55,"Chinu");
        //Before Sorting
        System.out.println("Before Sorting--->");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+"-->"+m.getValue());

        }
        //sorting using treemap
        Map<Integer,String> sorted_map= new TreeMap<Integer,String>(map);
        //After Sorting
        System.out.println("Before Sorting--->");
        for(Map.Entry m: sorted_map.entrySet()){
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
    }
}
