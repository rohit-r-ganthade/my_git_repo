/**
 * Created by rohit on 13/09/17.
 */
public class Final {

    private int sum;
    private final int NUMBER;

    public Final(int x){
        NUMBER = x;
    }

    public void add(){
        sum += NUMBER;
    }

    public String toString(){
        return String.format("Sum = %d \n", sum);
    }
}
