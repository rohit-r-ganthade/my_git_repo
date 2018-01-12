package JavatPointArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by rohit on 20/12/17.
 */
public class AnagramsTreeSet {

    public static void main(String args[]) {

        String str1 = "HELLO";
        String str2 = "HHHEO";
        int flag = 0;

        if (str1.length() == str2.length()) {
            ArrayList<Character> treeSet = new ArrayList<>();

            for (int i = 0; i < str1.toCharArray().length; i++) {
                treeSet.add(str1.charAt(i));
                treeSet.add(str2.charAt(i));
            }

            Collections.sort(treeSet);

            for (int i = 0; i < treeSet.size() - 1; i += 2) {
                if (treeSet.get(i) == treeSet.get(i + 1))
                    flag = 0;
                else {
                    System.out.println("Not a Anagram");
                    return;
                }
            }

            if (flag == 0)
                System.out.println("Its a Anagram");
        }
        else
            System.out.println("Invalid INPUT");
    }
}
