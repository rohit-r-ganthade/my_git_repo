/**
 * Created by rohit on 03/09/17.
 */
public class MathOperations {

    public static void main(String args[]) {

        int boys, girls, people;

        boys = 11;
        girls = 3;

        people = boys + girls;
        System.out.println("Addition is " + people);

        people = boys - girls;
        System.out.println("Substraction is " + people);

        people = boys * girls;
        System.out.println("Multiplication is " + people);

        people = boys / girls;
        System.out.println("Division is " + people);

        people = boys % girls;
        System.out.println("Modulus is " + people);
    }
}
