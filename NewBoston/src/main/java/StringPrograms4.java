/**
 * Created by rohit on 10/11/17.
 */
public class StringPrograms4 {

    public static void main(String args[]){

        int arr[] = { 1,3,1,76,54,2,89};
        for(int i = 0, j=i+1; i < arr.length && j<arr.length;)
        {
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i=0;
                j=i+1;
            }
            else
            {
                i++;
                j++;
            }
        }
        for (int ele: arr) {
            System.out.println(" "+ ele);
        }
    }
}
