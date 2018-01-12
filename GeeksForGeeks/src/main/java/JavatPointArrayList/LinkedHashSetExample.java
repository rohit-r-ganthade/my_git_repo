package JavatPointArrayList;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by rohit on 23/12/17.
 */
public class LinkedHashSetExample {
    public static void main(String args[]){
        LinkedHashSet<String> al=new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add(null);
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
