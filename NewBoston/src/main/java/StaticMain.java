/**
 * Created by rohit on 12/09/17.
 */
public class StaticMain {

    public static void main(String args[]) {

        Static obj = new Static("Rohit", "Ganthade");
        Static obj1 = new Static("Suresh", "Patil");
        Static obj2 = new Static("Shivaji", "Bhosle");

        System.out.println("=========");

        System.out.println(Static.getMembers());
    }
}