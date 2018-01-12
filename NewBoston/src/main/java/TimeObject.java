/**
 * Created by rohit on 07/09/17.
 */
public class TimeObject {

    public static void main(String args[]) {

        TimeClass timeClass = new TimeClass();

        timeClass.setTime(12,48,52);
        System.out.println(timeClass.toMilitary());
        System.out.println(timeClass.toString());

        timeClass.setTime(18,44,57);
        System.out.println(timeClass.toMilitary());
        System.out.println(timeClass.toString());
    }
}