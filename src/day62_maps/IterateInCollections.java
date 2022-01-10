package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateInCollections {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("James", "Adam", "Anna", "Beth"));
        System.out.println(list);
        //iterator allows iterating manually
        Iterator<String> it = list.iterator();
        System.out.println(it.next()); //iterates manually
        System.out.println(it.next());
        System.out.println(it.next());

        while (it.hasNext()){  //checks if there is another element
           String name = it.next();//moves to next and returns element
            if(name.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(list);


    }
}
