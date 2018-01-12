/**
 * Created by rohit on 07/09/17.
 */
public class EnhancedForLoop {

    public static void main(String args[]) {

        int total = 0;
        int bucky[] = { 2,3,1,5,4};

        for (int x : bucky){
            total+= x;
        }

        System.out.println("Total is " + total);
    }
}