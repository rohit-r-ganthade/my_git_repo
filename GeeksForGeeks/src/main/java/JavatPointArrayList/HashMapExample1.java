package JavatPointArrayList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rohit on 22/12/17.
 */
public class HashMapExample1 {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(13,"Vijay");
        map.put(13,"Vijay1");
        map.put(10,"Amar");
        map.put(101,"Vijay");
        map.put(100,"Amit");
        map.put(102,"Rahul");
        map.put(99,"Vijay");
        map.put(null,"1");
        map.put(null,"2");

        map.remove(13,"Vijay");


 //       System.out.println(map);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

//        for (Map.Entry ignored : map.entrySet()) {
//            System.out.println(ignored.getKey() + "====" + ignored.getValue());
//        }
    }
}
