/**
 * Created by rohit on 03/09/17.
 */
public class Tuna {

    private String girlName;

    public Tuna(String name){
        girlName = name;

    }

    public void setGirlName(String name){
        girlName = name;
    }

    public String getGirlName(){
        return girlName;
    }

    public void saying(){
        System.out.println(" Your first gf was " + getGirlName());
    }

    public void message(){
        System.out.println("This is from another class");
    }

    public void messageName(String name){
        System.out.println(" Hello " + name);
    }
}
