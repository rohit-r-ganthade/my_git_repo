/**
 * Created by rohit on 10/11/17.
 */
public class StringPrograms
{
    static void reverseString(String inputString)
    {
        char[] inputStringArray = inputString.toCharArray();

        char[] resultArray = new char[inputStringArray.length];

        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] == ' ')
            {
                resultArray[i] = ' ';
            }
        }

        int j = resultArray.length-1;

        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ')
            {
                if(resultArray[j] == ' ')
                {
                    j--;
                }

                resultArray[j] = inputStringArray[i];

                j--;
            }
        }

        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
    }

    public static void main(String[] args)
    {
        reverseString("I Am Not String");

        reverseString("JAVA JSP ANDROID");

        reverseString("1 22 333 4444 55555");
    }
}
