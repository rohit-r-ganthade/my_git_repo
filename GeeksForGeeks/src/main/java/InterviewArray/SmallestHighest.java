package InterviewArray;

/**
 * Created by rohit on 23/12/17.
 */
public class SmallestHighest {


    public static void main(String args[]) {

        int arr[] = {11, 2, 3, 4, 0, 5, -7, 8, 9, 10};

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){

            if (arr[i] > largest)
                largest = arr[i];

            if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println(" Largest = " + largest);
        System.out.println(" Smallest = " + smallest);
    }
}
