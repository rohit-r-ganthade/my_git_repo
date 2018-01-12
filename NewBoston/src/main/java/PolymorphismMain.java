/**
 * Created by rohit on 13/09/17.
 */
public class PolymorphismMain {

    public static void main(String args[]) {

        PolymorphismFood polymorphismFood[] = new PolymorphismFood[2];

        polymorphismFood[0] = new PolymorphismPotpie();
        polymorphismFood[1] = new PolymorphismTuna();

        for (int x = 0; x < 2; x++) {
            polymorphismFood[x].eat();
        }

        System.out.println("===========================================");

        PolymorphismFatty polymorphismFatty = new PolymorphismFatty();

        // PolymorphismFood polymorphismFood1 = new PolymorphismFood();
        // doesn't work because PolymorphismFood class is abstract

        PolymorphismFood polymorphismFood2 = new PolymorphismTuna();
        PolymorphismFood polymorphismFood3 = new PolymorphismPotpie();

        //  polymorphismFatty.digest(polymorphismFood1);
        PolymorphismPotpie polymorphismPotpie = new PolymorphismPotpie();
        System.out.println("===================1========================");
        polymorphismPotpie.eat();
        System.out.println("====================2=======================");


        polymorphismFatty.digest(polymorphismFood2);
        polymorphismFatty.digest(polymorphismFood3);

    }
}