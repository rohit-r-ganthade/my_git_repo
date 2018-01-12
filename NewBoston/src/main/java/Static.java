/**
 * Created by rohit on 12/09/17.
 */
public class Static {

    private String first;
    private String last;
    private static int members;

    public Static(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s , members in the club : %d \n", first, last, members);
    }

    public static int getMembers(){
        return members;
    }


}
