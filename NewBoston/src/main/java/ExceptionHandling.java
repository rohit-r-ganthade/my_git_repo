import java.util.Scanner;

/**
 * Created by rohit on 16/09/17.
 */
public class ExceptionHandling {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int x =1;

        do {
            try {
                System.out.println("Enter first number");
                int num1 = scanner.nextInt();

                System.out.println("Enter second number");
                int num2 = scanner.nextInt();

                int result = num1 / num2;

                System.out.println("Result is " + result);
                x = 2;

            } catch (Exception e) {
                System.out.println("You can't do that " + e.getMessage());
            }
        }while (x==1);
    }
}