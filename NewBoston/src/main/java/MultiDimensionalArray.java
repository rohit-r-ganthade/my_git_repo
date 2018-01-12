/**
 * Created by rohit on 07/09/17.
 */
public class MultiDimensionalArray {

    public static void main(String args[]) {

        int firstArray[][] = {{1,2,3,4}, {5,6,7,8}};
        int secondArray[][] = {{9,10,11,12}, {13}, {14,15}, {16,17,18,19,20}, {21,22,23}};

        System.out.println("First array elements are");
        display(firstArray);

        System.out.println("Second array elements are");
        display(secondArray);
    }

    public static void display(int x[][]){
        for (int row=0; row<x.length; row++){
            for (int column = 0; column<x[row].length; column++){
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}