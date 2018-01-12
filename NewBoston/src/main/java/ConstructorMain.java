/**
 * Created by rohit on 07/09/17.
 */
public class ConstructorMain {

    public static void main(String args[]) {

        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(4);
        Constructor constructor2 = new Constructor(2,3);
        Constructor constructor3 = new Constructor(5,16,27);

        System.out.printf("%s\n", constructor.toMilitary());
        System.out.printf("%s\n", constructor1.toMilitary());
        System.out.printf("%s\n", constructor2.toMilitary());
        System.out.printf("%s\n", constructor3.toMilitary());

    }
}