import java.util.EnumSet;

/**
 * Created by rohit on 08/09/17.
 */
public class EnumMain {

    public static void main(String args[]) {

        for (Enum people : Enum.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

        System.out.println("\nAnd now for the range of constants...!!!\n");

        for (Enum people : EnumSet.range(Enum.Ramesh, Enum.Akash))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
    }
}