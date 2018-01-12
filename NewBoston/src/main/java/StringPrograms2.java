import java.util.Scanner;

/**
 * Created by rohit on 10/11/17.
 */
public class StringPrograms2 {

    public static void main(String[] args){{

            Scanner scanner = new Scanner(System.in);
          //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter string: ");
            String s = scanner.nextLine();
            String reverse = "";
            int length = s.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + s.charAt(i);
            System.out.println("Result:" + reverse);
        }
    }
}
