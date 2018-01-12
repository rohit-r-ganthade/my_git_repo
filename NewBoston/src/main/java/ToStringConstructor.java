/**
 * Created by rohit on 08/09/17.
 */
public class ToStringConstructor {

    private String name;
    private ToString birthday;

    public ToStringConstructor(String theName, ToString theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name , birthday);
    }
}
