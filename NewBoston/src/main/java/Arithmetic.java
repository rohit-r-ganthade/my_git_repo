import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rohit on 03/09/17.
 */
public class Arithmetic {

    public static void main(String args[]) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        double fnum, snum, answer;
//
//        System.out.println("Enter first number");
//        fnum = scanner.nextDouble();
//
//        System.out.println("Enter second number");
//        snum = scanner.nextDouble();
//
//        answer = fnum + snum;
//
//        System.out.println("Total of both the number's is");
//        System.out.println(answer);

//        String str = "java";
//        char ch[] = str.toCharArray();
//        for(int i = 0;i<ch.length;i++){
//            int count=0;
//            for (int j=0;j<ch.length;j++){
//                if (ch[i]==ch[j])
//                    count++;
//            }
//            System.out.println( ch[i] + " is printed " + count + " times");
//        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter string: ");
//        String s = br.readLine();
//        String reverse = "";
//        int length = s.length();
//
//        for (int i = length - 1; i >= 0; i--)
//            reverse = reverse + s.charAt(i);
//        System.out.println("Result:" + reverse);

//       String str = new Arithmetic().reverseWordByWord("Hello World");
//        System.out.println(str);
//    }

//    public String reverseWordByWord(String str){
//        int strLeng = str.length()-1;
//        String reverse = "", temp = "";
//
//        for(int i = 0; i <= strLeng; i++){
//            temp += str.charAt(i);
//            if((str.charAt(i) == ' ') || (i == strLeng)){
//                for(int j = temp.length()-1; j >= 0; j--){
//                    reverse += temp.charAt(j);
//                    if((j == 0) )
//                        reverse += " ";
//                }
//                temp = "";
//            }
//        }
//        return reverse;

        String str = "java";
//        char ch[] = str.toCharArray();
//        for(int i = 0;i<ch.length;i++){
//            int count=0;
//            for (int j=0;j<ch.length;j++){
//                if (ch[i]==ch[j])
//                    count++;
//            }
//            System.out.println( ch[i] + " is printed " + count + " times");
//        }

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0; i <str.length() ;i++){
            if (map.get(str.charAt(i)) == null)
                map.put(str.charAt(i), 1);
            else
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }

      //  System.out.println(map.toString());

//        for (Map.Entry map1 : map.entrySet()){
//            System.out.println(map1.getKey()  + " is printed " + map1.getValue() + " times.");
//        }
        for (Character ch : map.keySet()){
            System.out.println(ch  + " is printed " + map.get(ch) + " times.");
        }
    }
}
