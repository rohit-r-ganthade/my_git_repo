import java.util.Random;

/**
 * Created by rohit on 04/09/17.
 */
public class ArrayElements {

    public static void main(String args[]) {

        Random random = new Random();
        int freq[] = new int[7];

        for (int roll=1; roll<=1000; roll++){
            ++freq[1 + random.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int face=1; face<freq.length; face++){
            System.out.println(face + "\t\t\t" + freq[face]);
        }
    }
}