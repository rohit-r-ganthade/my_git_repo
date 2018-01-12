import java.util.Scanner;

/**
 * Created by rohit on 10/11/17.
 */
public class StringPrograms3 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scanner.nextLine();

        String temp[] = str.split(" ");
        for (int i=temp.length-1; i>=0; i--)
            System.out.print(" " + temp[i]);
    }
}
