package JavatPointArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rohit on 19/12/17.
 */
public class TestList {
    public static void main(String args[]){

        LinkedHashSet<String> al1=new LinkedHashSet<String>();

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);

//        ListIterator listIterator = al.listIterator();
//        while (listIterator.hasNext())
//            System.out.println(listIterator.next());
//
//        System.out.println("==========================");
//
//        while (listIterator.hasPrevious())
//            System.out.println(listIterator.previous());
    }
}
