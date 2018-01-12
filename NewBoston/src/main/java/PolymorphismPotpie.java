/**
 * Created by rohit on 13/09/17.
 */
public class PolymorphismPotpie extends PolymorphismFood{

    void eat1(){
        System.out.println("This Potpie is great");
    }

    @Override
    public void testing() {
        System.out.println("Testing Potpie");
    }
}
