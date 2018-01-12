/**
 * Created by rohit on 06/01/18.
 */
public class DigitCharacter {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello1";
        String str3 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.compareTo(str2));
    }
}