package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ElementExistInList {

    public static void main(String args[]){
        List<String> lis= new ArrayList<String>();
        lis.add("Saheb");
        lis.add("Sourabh");
        lis.add("Shilpi");
        //checking if shilpi is present in list -> will print false as s is in small letter
        System.out.println(lis.contains("shilpi"));
        //checking if Shilpi is present in list-> will print true as S is in capital letter
        System.out.println(lis.contains("Shilpi"));
    }
}
