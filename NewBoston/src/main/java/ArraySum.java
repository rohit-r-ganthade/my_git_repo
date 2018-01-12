/**
 * Created by rohit on 04/09/17.
 */
public class ArraySum {

    public static void main(String args[]) {

        int array[] = {2,4,6,8,10};
        int sum = 0;

        for (int counter =0; counter<5; counter++){
            sum+= array[counter];
        }

        System.out.println("Total sum is " + sum);
    }
}