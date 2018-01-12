/**
 * Created by rohit on 04/09/17.
 */
public class NestedIfElse {

    public static void main(String args[]) {

        int age = 60;

        if (age < 50) {
            System.out.println("You are young");
        } else {
            System.out.println("You are old");
            if (age > 75) {
                System.out.println("You are really very old");
            } else {
                System.out.println("You are not really old");
            }
        }
    }
}