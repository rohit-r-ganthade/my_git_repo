/**
 * Created by rohit on 07/09/17.
 */
public class ToStringMain {

    public static void main(String args[]) {

        ToString toString = new ToString(3,4,5);
        ToStringConstructor toStringConstructor = new ToStringConstructor("Rohit", toString);

        System.out.println(toStringConstructor);
    }
}