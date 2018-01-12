/**
 * Created by rohit on 03/09/17.
 */
public class LogicalOperator {

    public static void main(String args[]) {

        int boy, girl;
        boy = 21;
        girl = 18;

        if(boy > 20 && girl > 17){
            System.out.println("You can marry");
        }else{
            System.out.println("You cannot marry");
        }

        System.out.println("*****************************");

        if(boy > 20 || girl > 27){
            System.out.println("You can marry");
        }else{
            System.out.println("You cannot marry");
        }
    }
}