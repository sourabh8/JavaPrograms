package CollectionPractice;

import java.util.LinkedList;
import java.util.List;

public class AddElementAtIndexArrayList {
    public static void main(String args[]){
        List<Integer> list= new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(25);
        //traversing before adding element at index 1
        for (Integer number:list) {
            System.out.println(number);
        }
        //Adding 27 at Index 1
        list.add(1,27);
        System.out.println("--->");
        //traversing after adding element at index 1
        for (Integer number:list) {
            System.out.println(number);
        }
    }
}
