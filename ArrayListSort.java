package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

    public static void main(String args[]){

        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(100);
        list.add(12);

        //asscending order sorting using sort method
        Collections.sort(list);
        //printing list
        for(Integer numbers:list){
            System.out.println(numbers);

        }
        System.out.println("-------------->");
        //descending order sorting using sort method
        Collections.sort(list,Collections.reverseOrder());
        //printing list in descending order
        for(Integer numbers:list){
            System.out.println(numbers);
        }
    }
}
