/**
 * Created by rohit on 15/09/17.
 */
public class ObjectMain {

    public static void main(String args[]) {

        ObjectAnimalList objectAnimalList = new ObjectAnimalList();
        ObjectDog objectDog = new ObjectDog();
        ObjectFish objectFish = new ObjectFish();
        objectAnimalList.add(objectDog);
        objectAnimalList.add(objectFish);

        System.out.println("================================");

        ObjectAnimal list[] = new ObjectAnimal[2];

        ObjectDog objectDog1 = new ObjectDog();
        ObjectFish objectFish1 = new ObjectFish();

        list[0] = objectDog1;
        list[1] = objectFish1;

        for (ObjectAnimal objectAnimal : list){
            objectAnimal.noise();
        }
    }
}