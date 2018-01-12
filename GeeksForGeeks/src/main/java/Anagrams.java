import java.util.Arrays;

/**
 * Created by rohit on 13/12/17.
 */
public class Anagrams
{
    // Method to sort a string alphabetically
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    // Driver method
    public static void main(String[] args)
    {
        String inputString = "INTEGRAL";
        String outputString = sortString(inputString);

        String str1 = "TRIANGLE";
        String outputString1 = sortString(str1);

        if (outputString.equals(outputString1))
            System.out.println("They are anagrams");
        else
            System.out.println("They are not angrams");

        System.out.println(outputString);
        System.out.println(outputString1);

    }
}
