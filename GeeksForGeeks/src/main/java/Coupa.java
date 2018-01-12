/**
 * Created by rohit on 12/12/17.
 */
public class Coupa {

    public static void main(String[] args){

        int arr[] = {3,1,2,21,32,-32,11,2,3};
        int largest, secondLargest;
        largest=secondLargest=Integer.MIN_VALUE;

//        for (int i=0; i<arr.length; i++){
//            if (arr[i]>largest)
//                largest=arr[i];
//
//        }
//
//        for (int j=0; j<arr.length; j++){
//            if (arr[j]>secondLargest && arr[j]!=largest)
//                secondLargest=arr[j];
//        }
//        System.out.println("Second largest element is " + secondLargest);

        for (int i=0; i<arr.length; i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];

            }else if ( arr[i]>secondLargest)
                secondLargest = arr[i];
        }

        System.out.println( " Second = " + secondLargest);
    }
}
