/**
 * Created by rohit on 04/09/17.
 */
public class ArrayTable {

    public static void main(String args[]) {

        int array[] = {2,4,6,8,10};

        System.out.println("Index \t Value");

        for (int counter=0; counter<array.length; counter++){
            System.out.println(counter + "\t\t\t" + array[counter]);
        }
    }
}