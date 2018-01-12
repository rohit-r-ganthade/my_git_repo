/**
 * Created by rohit on 04/11/17.
 */
public class HeadFirstJava1 {

    public static void main(String args[]) {

        int beernum = 99;
        String word = "bottles";

        while (beernum > 0){

            if (beernum == 0)
                word = "bottle";

            System.out.println(beernum + " " + word + " of beer on the table");
            System.out.println(" Take one out and");
            System.out.println(" pass it on");
            beernum--;

            if (beernum > 0)
                System.out.println(beernum + " " + word + " of beer on the table");
            else
                System.out.println(" No more bottles left on the tale");

            System.out.println("======================================================");
        }
    }
}
