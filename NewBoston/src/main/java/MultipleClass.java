import java.util.Scanner;

/**
 * Created by rohit on 03/09/17.
 */
public class MultipleClass {

    public static void main(String args[]) {

        Tuna tuna = new Tuna("Priyanka");
        tuna.saying();

        Tuna tuna1 = new Tuna("Deepika");
        tuna1.saying();

        tuna.message();

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your name : ");
        String name = scanner.nextLine();

        tuna.messageName(name);

        System.out.println(" Enter your first gf name : ");
        String girlName = scanner.nextLine();

        tuna.setGirlName(girlName);
        tuna.saying();
    }
}