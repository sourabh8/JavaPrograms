package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConversion {
    public static  void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("Sourabh");
        list.add("Shilpi");
        list.add("saheb");

        //Creating Array and converting List to Array
        String[] arr=list.toArray(new String[list.size()]);
        //traversing Array
        for(String str:arr) {
            System.out.println(str);
        }
    }
}
