/**
 * Created by rohit on 01/12/17.
 */
public class PairsInArrays {
    // This function returns true if arr[0..n-1]
    // has a pair with sum equals to x.
    static boolean pairInSortedRotated(int arr[],
                                       int n, int x)
    {
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1])
                break;

        int l = (i + 1) % n; // l is now index of

        int r = i;       // r is now index of maximum

        while (l != r)
        {
            if (arr[l] + arr[r] == x)
                return true;

            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            else
                r = (n + r - 1) % n;
        }
        return false;
    }

    /* Driver program to test above function */
    public static void main (String[] args)
    {
        int arr[] = {11, 15, 17, 8, 1, 10};
        int sum = 26;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
            System.out.print("ArrayListMain has two elements" +
                    " with sum " + sum);
        else
            System.out.print("ArrayListMain doesn't have two" +
                    " elements with sum " + sum);
    }
}
