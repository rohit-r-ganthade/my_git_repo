/**
 * Created by rohit on 13/09/17.
 */
public class PolymorphismTuna extends PolymorphismFood{

    void eat(){
        System.out.println("This Tuna is great");
    }

    @Override
    public void testing() {
        System.out.println("Testing Tuna");
    }
}
