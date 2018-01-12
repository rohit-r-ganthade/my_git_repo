import java.util.Arrays;

/**
 * Created by rohit on 25/12/17.
 */
public class TwoArrayComparison {

    public static void main(String[] args){

        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};

        System.out.println(Arrays.equals(a ,b));

        for (int i=0; i<a.length; i++)
            System.out.println(a[i]);

        System.out.println("======");

        for (int i=0; i<b.length; i++)
            System.out.println(b[i]);

        System.out.println("======");

        int c[] = Arrays.copyOf(a,a.length-2);
        for (int i=0; i<c.length; i++)
            System.out.println(c[i]);
    }
}
