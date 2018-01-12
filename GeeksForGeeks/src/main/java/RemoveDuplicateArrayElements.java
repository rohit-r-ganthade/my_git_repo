import java.util.Arrays;

/**
 * Created by rohit on 01/12/17.
 */
public class RemoveDuplicateArrayElements{
    static void removeDuplicates(int[] arrayWithDuplicates)
    {
        System.out.println("ArrayListMain With Duplicates : ");

        for (int i = 0; i < arrayWithDuplicates.length; i++)
        {
            System.out.print(arrayWithDuplicates[i]+"\t");
        }

        int noOfUniqueElements = arrayWithDuplicates.length;

        for (int i = 0; i < noOfUniqueElements; i++)
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }

        //        Set set = new HashSet();
//        for (int i=0; i< arrayWithDuplicates.length ; i++)
//            set.add(arrayWithDuplicates[i]);
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);

        System.out.println();
        System.out.println("ArrayListMain Without Duplicates : ");

        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }

        System.out.println();

        System.out.println("==============================");
    }

    public static void main(String[] args)
    {
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2,4,2,2,2,3,3,4,7,9,2});
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
    }
}