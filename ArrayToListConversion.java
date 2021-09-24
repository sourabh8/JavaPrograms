package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListConversion {

    public  static void main(String args[]) {
        String[] str_array = {"Sourabh", "Sachin", "Sehwag"};
        List<String> str_list = new ArrayList<String>();
        List<String> str_addAllList= new ArrayList<String>();
        //converting array to list
        str_list= Arrays.asList(str_array);
        //printing content of list using for each loop
        for(String str: str_list){
            System.out.println(str);
        }
        //using addAll method which is more faster then asList method
        Collections.addAll(str_addAllList,str_array);
        //ading two more elements to list
        str_addAllList.add("Dravid");
        str_addAllList.add("Murli");
        System.out.println("-------------->");
        //traversing list
        for(String str: str_addAllList){

            System.out.println(str);
        }
    }
}
