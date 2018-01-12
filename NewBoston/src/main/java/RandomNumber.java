import java.util.Random;

/**
 * Created by rohit on 04/09/17.
 */
public class RandomNumber {

    public static void main(String args[]) {

        Random random = new Random();
        int number;

        for (int counter=1; counter<=5; counter++){
            number = random.nextInt(5);
            System.out.println(number);
        }
    }
}