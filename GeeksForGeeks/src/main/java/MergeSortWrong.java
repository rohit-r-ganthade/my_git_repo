/**
 * Created by rohit on 05/12/17.
 */
public class MergeSortWrong {
    void merge(int arr[], int low, int mid, int high)
    {

        int newarr[] = new int[arr.length], i, j, k;
        k = low;
        i = low;
        j = mid + 1;

        while ((i <= mid) && (j <= high)) {
            if (arr[i] < arr[j])
                newarr[k++] = arr[i++];
            else
                newarr[k++] = arr[j++];
        }

        while ((i <= mid))
            newarr[k++] = arr[i++];

        while ((j <= high))
            newarr[k++] = arr[j++];

        for (i = low; i <= k - 1; i++)
            arr[i] = newarr[i];


    }

    void sort(int arr[], int low, int high)
    {
        int mid;
        if (low < high)
        {
            mid = (low+high)/2;
            sort(arr, low, mid);
            sort(arr , mid+1, high);
            merge(arr, low, mid, high);
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
        int arr[] = {7,5,6};

        System.out.println("Given ArrayListMain");
        printArray(arr);

        MergeSortWrong ob = new MergeSortWrong();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}


