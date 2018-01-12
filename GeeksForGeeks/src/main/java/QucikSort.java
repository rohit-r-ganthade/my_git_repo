/**
 * Created by rohit on 06/12/17.
 */
public class QucikSort {
    int partition(int arr[], int low, int high)
    {

        int i,j,temp,key;
        key = arr[low];
        i = low + 1;
        j = high;

        while (true)
        {
            while (i < high && key >= arr[i])
                i++;

            while (key < arr[j])
                j--;

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else {
                temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;
                return j;
            }
        }
    }

    void quickSort(int arr[], int low, int high)
    {
        int j;
        if (low < high)
        {
            j = partition(arr, low, high);
            quickSort(arr, low, j-1);
            quickSort(arr, j+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7, 17};

        System.out.println("Given ArrayListMain");
        printArray(arr);

        QucikSort ob = new QucikSort();
        ob.quickSort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}



