/**
 * Created by rohit on 17/12/17.
 */
public abstract class Swap {

    int a, b;

    public Swap(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("===== GOOD MORNING ====");

    }
//    public static void main(String... args){
//
//        int num =25;
//        long start = new Date().getTime();
//        System.out.println(start +  "   " +  generateAllFactors(num) + new Date().getTime());
//    }
//
//    static List<Integer> generateAllFactors(int num){
//        List<Integer> result = new Arraylist<>();
//        if (num <= 0)
//            return result;
//
//        for (int i =1; i<= Math.sqrt(num) ;i++){
//            if (num %i ==0) {
//                result.add(i);
//                if (i!= (num/i)){
//                    result.add(num/i);
//                }
//            }
//        }
//
//        for (int i=0; i<10000; i++){
//            System.out.print("");
//        }
//        return result;
//    }
}
