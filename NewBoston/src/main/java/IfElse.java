/**
 * Created by rohit on 03/09/17.
 */
public class IfElse {

    public static void main(String args[]) {

        int tuna = 9;
        int fish = 3;

        // ==, !=, <, >, <=, >=
        if(tuna == fish){
            System.out.println(tuna + " is equal to " + fish);
        }else{
            System.out.println(tuna + " is not equal to " + fish);
        }

        if(tuna != fish){
            System.out.println(tuna + " is not equal to " + fish);
        }else{
            System.out.println(tuna + " is equal to " + fish);
        }

        if(tuna < fish){
            System.out.println(tuna + " is less than " + fish);
        }else{
            System.out.println(tuna + " is not less than " + fish);
        }

        if(tuna > fish){
            System.out.println(tuna + " is greater than " + fish);
        }else{
            System.out.println(tuna + " is not greater than " + fish);
        }

        if(tuna <= fish){
            System.out.println(tuna + " is less than or equal to " + fish);
        }else{
            System.out.println(tuna + " is not less than or equal to " + fish);
        }

        if(tuna >= fish){
            System.out.println(tuna + " is greater than or equal to " + fish);
        }else{
            System.out.println(tuna + " is not greater than or equal to " + fish);
        }
    }
}
