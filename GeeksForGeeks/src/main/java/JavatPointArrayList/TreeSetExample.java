package JavatPointArrayList;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by rohit on 20/12/17.
 */
public class TreeSetExample {
    public static void main(String[] args) {

        Set<Book> set=new TreeSet<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b4=new Book(221,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(133,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(201,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        //Traversing TreeSet
        for(Book b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

//        int arr[] = {33,12,43,65,87,45,98,122,321,31,2222,432, 434};
//        List<Integer> set = new ArrayList<>();
//        for (int i =0; i<arr.length; i++){
//            set.add(arr[i]);
//        }
//
//        Collections.sort(set);
//        System.out.println(set.get(set.size()-2));

    }
}
