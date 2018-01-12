/**
 * Created by rohit on 04/09/17.
 */
public class ElseIf {

    public static void main(String args[]) {

        int age = 55;

        if (age >= 60)
            System.out.println("You are in your 60's");
        else if (age >= 50)
            System.out.println("You are in your 50's");
        else if (age >= 40)
            System.out.println("You are in your 40's");
        else
            System.out.println("You are young");

        System.out.println("*******************************");

        System.out.println( age > 60 ? "You are too old" : "You are too young");

    }
}