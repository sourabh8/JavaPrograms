package CollectionPractice;

import java.util.LinkedList;
import java.util.List;

public class RemoveElementAtIndexArrayList {

    public static void main(String args[]){
        List<Integer> list= new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(25);
        //traversing before adding element at index 1
        for (Integer number:list) {
            System.out.println(number);
        }
        //Removing element at Index 1
        list.remove(1);
        System.out.println("--->");
        //traversing after adding element at index 1
        for (Integer number:list) {
            System.out.println(number);
        }
    }
}
