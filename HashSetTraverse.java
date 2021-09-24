package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraverse {

    public static  void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        set.add("Sourabh");
        set.add("Shilpi");
        set.add("Saheb");

        //traversing through for each loop
        for(String name:set){
            System.out.println(name);
        }

        //traversing through iterator
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
