package CollectionPractice;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSortByValues {
    public static  void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Aus");
        map.put(2,"Ind");
        map.put(3,"Eng");
        Set<Entry<Integer,String>> entries= map.entrySet();
        //Now lets sort above map by values
        //There is no direct way to sort Hashmap by values
        //We can do this by creating our own comparator
        Comparator<Entry<Integer,String>> valuecomparator = new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                String value1=o1.getValue();
                String value2=o2.getValue();
                return value1.compareTo(value2);
            }
        };
        //Now we will use sort method which needs a list, So first convert set of entries into List
        List<Entry<Integer,String>> sortedlist= new ArrayList<Entry<Integer,String>>(entries);
        Collections.sort(sortedlist,valuecomparator);
        //Now we will create one Linked Hash Map and store the sortedlist in this LinkedHasMap
        LinkedHashMap<Integer,String> linkedmap = new LinkedHashMap<Integer,String>(sortedlist.size());
        for(Entry<Integer,String> entry:sortedlist){
            linkedmap.put(entry.getKey(),entry.getValue());
        }
        //iterating through LinkedHashMap
        for(Map.Entry m:linkedmap.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
