package JavatPointArrayList;

import java.util.ArrayList;

/**
 * Created by rohit on 20/12/17.
 */
public class ArrayListReatinAll {
    public static void main(String args[]){


//        ArrayList<String> al=new ArrayList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ajay");
//        ArrayList<String> al2=new ArrayList<String>();
//        al2.add("Ravi");
//        al2.add("Hanumat");
//        al.retainAll(al2);
//        System.out.println("iterating the elements after retaining the elements of al2...");
//        Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        ArrayList<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        System.out.println("element at 2nd position: "+al.get(2));
    }
}
