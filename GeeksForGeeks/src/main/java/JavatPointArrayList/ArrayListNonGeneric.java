package JavatPointArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by rohit on 22/12/17.
 */
public class ArrayListNonGeneric {

    public static void main(String args[]) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("wew");
        arrayList.add(1);
        arrayList.add("Rohit");
        arrayList.add(99);

        ListIterator iterator = arrayList.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("==================");

        while (iterator.hasPrevious())
            System.out.println(iterator.previous());

    }
}
