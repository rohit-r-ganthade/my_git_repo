/**
 * Created by rohit on 04/11/17.
 */
public class HeadFirstJava2 {

    public static void main(String args[]){

//        String list1[] = {"Hi", "How", "Are"};
//        String list2[] = {"I", "Am", "Doing", "Good"};
//        String list3[] = {"Chal", "See", "You", "Later", "Bye"};
//
//        int list1Length = list1.length;
//        int list2Length = list2.length;
//        int list3Length = list3.length;
//
//        int random1 = (int) (Math.random() * list1Length);
//        int random2 = (int) (Math.random() * list2Length);
//        int random3 = (int) (Math.random() * list3Length);
//
//        System.out.println("==" + random1 + "==" + random2 + "==" + random3);
//
//        String str = list1[random1] + " " + list2[random2] + " " +list3[random3];
//
//        System.out.println(str);

//        int x=5;
//        while (x>1){
//            x=x-1;
//            if (x<3){
//                System.out.println("small x");
//            }
//        }

       // String str = "Rohit How are u";

        int digit, num = 9870;
        while (num>0){
            digit = num %10;
            System.out.println("==" + digit);
            num = num/10;
        }


    }
}
