/**
 * Created by rohit on 15/09/17.
 */
public class ObjectAnimalList {

    private ObjectAnimal theList[] = new ObjectAnimal[5];
    private int i=0;

    public void add(ObjectAnimal objectAnimal){

        if (i<theList.length){
            theList[i] = objectAnimal;
            System.out.println("Animal added at index " + i);
            i++;
        }
    }
}
