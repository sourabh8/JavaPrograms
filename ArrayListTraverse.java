package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraverse {

    public static void main(String args[]){

        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Sourabh");
        arr.add("Saheb");
        arr.add("Shilpi");

        //traversing using iterator
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //traversing using for each loop
        for(String s:arr){
            System.out.println(s);
        }
    }
}
