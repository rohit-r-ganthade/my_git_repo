import java.util.Scanner;

/**
 * Created by rohit on 04/09/17.
 */
public class Average {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int total = 0, grade, average, counter =0, n=5;

        while (counter < n){
            grade = scanner.nextInt();
            total = total + grade;
            counter++;
        }

        average = total/n;
        System.out.println("Total is " + total);
        System.out.println("Average is " + average);

    }
}