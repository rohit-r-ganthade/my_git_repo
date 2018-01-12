/**
 * Created by rohit on 03/09/17.
 */
public class Switch {

    public static void main(String args[]) {

        int age = 3;

        switch (age){

            case 1 :
                System.out.println("age is one");
                break;

            case 2 :
                System.out.println("age is two");
                break;

            case 3 :
                System.out.println("age is three");
                break;

            default:
                System.out.println("age is other than one, two or three");
                break;
        }
    }
}