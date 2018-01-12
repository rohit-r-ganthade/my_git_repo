/**
 * Created by rohit on 07/09/17.
 */
public class ArraysInMethods {

    public static void main(String args[]) {

        int bucky[] = {3,4,5,6,7};
        change(bucky);

        for (int y : bucky)
        System.out.println(y);
    }

    public static void change(int x[]){
        for (int i=0; i<x.length; i++)
            x[i]+= 5;
    }
}