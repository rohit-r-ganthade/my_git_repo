/**
 * Created by rohit on 07/09/17.
 */
public class VariableLengthArgument {

    public static void main(String args[]) {

        System.out.println(average(2,3,4,5,6,7,8));
    }

    public static int average(int...numbers){

        int total=0;
        for (int x : numbers)
            total+= x;

        return total/numbers.length;
    }
}