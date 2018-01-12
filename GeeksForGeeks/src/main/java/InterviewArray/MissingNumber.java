package InterviewArray;

/**
 * Created by rohit on 23/12/17.
 */
public class MissingNumber {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,7,8,9,10};
        int size = arr.length + 1;

        printMissingNumber(arr,size);
    }

    private static void printMissingNumber(int[] arr, int size) {

        int sum=0, arrSum=0, missingNumber=0;
        for (int i=0; i<=size; i++)
            sum +=i;

        for (int i=0; i<arr.length; i++)
            arrSum +=arr[i];

        missingNumber = sum - arrSum;

        System.out.println(" Missing number is = " + missingNumber);
    }
}
