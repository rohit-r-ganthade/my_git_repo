import java.util.regex.Pattern;

/**
 * Created by rohit on 02/12/17.
 */
public class PatternMatching {
    public static void main(String args[]){
//        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
//        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
//        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
//        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
//        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)

//        System.out.println("========");

//        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
//        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
//        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

//        System.out.println("========");

//        System.out.println("? quantifier ....");
//        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
//        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
//        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
//        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
//        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)
//
//        System.out.println("+ quantifier ....");
//        System.out.println(Pattern.matches("[amn]+", "amm"));//true (a or m or n once or more times)
//        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
//        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
//        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)
//
//        System.out.println("* quantifier ....");
//        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
//        System.out.println(Pattern.matches("[amn]*", "amm"));
//        System.out.println(Pattern.matches("[amn]*", "aammmnn"));
//        System.out.println(Pattern.matches("[amn]*", "aazzta"));
//
//        System.out.println("========");
//
//        System.out.println("metacharacters d....");//d means digit
//
//        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
//        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
//        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
//        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
//
//        System.out.println("metacharacters D....");//D means non-digit
//
//        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
//        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
//        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
//        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
//        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
//
//        System.out.println("metacharacters D with quantifier....");
//        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
//
//        System.out.println("========");
//
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
//        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)

           System.out.println("========");

//        System.out.println("by character classes and quantifiers ...");
//        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
//        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
//
//        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
//        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
//
//        System.out.println("by metacharacters ...");
//        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
//        System.out.println(Pattern.matches("^\\d+(\\.\\d+)?", "3853038949.900"));//false (starts from 3)
//        System.out.println(Pattern.matches("[^amn]", "lm"));//false
//        System.out.println(Pattern.matches("[abc][vz]", "az"));//true
//        System.out.println(Pattern.matches("[a-d1-7]", "2"));//true
//        System.out.println(Pattern.matches("X|Z", "X"));//true  ^[^\\d].*
//        System.out.println(Pattern.matches("XZ", "XZ"));//true  ([\\w&&[^b]])*
//        System.out.println(Pattern.matches("\\d", "1"));//true \d{1,4}
//        System.out.println(Pattern.matches("\\d{1,4}", "1111"));//true  [^0-9]*[12]?[0-9]{1,2}[^0-9]*
 //       System.out.println(Pattern.matches("a*b", "aaaaab"));
  //      System.out.println(Pattern.matches("[a-zA-Z]", "Aa"));
  //      System.out.println(Pattern.matches("[a-d[m-p]]", "d"));
  //      System.out.println(Pattern.matches("[a-z&&[def]]", "e"))
 //         System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));
//        System.out.println(Pattern.matches("\\w", "1"));
//        System.out.println(Pattern.matches("a*b", "aaaaab"));
//        System.out.println(Pattern.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", "rohit.ganthade@gmail.c.o"));
//        System.out.println(Pattern.matches("^[\\w]+(\\.[\\w]+)*@[\\w]+\\.[\\w]{2,}(\\.[\\w]{2})*$", "rohit.ganthade@gmail.ckmdsdsdm.aa"));
//        System.out.println(Pattern.matches("[\\.]*", ""));
        System.out.println(Pattern.matches("\\d{4}-\\d{2}-\\d{2}", "1111-11-11"));
//        String str = "My name is Rohit rohit.ganthade@gmail.com";
//        List<String> list = Arrays.asList(str.split(" "));
//        for (String ele : list){
//            if (isMatched(ele))
//                System.out.println(ele);
//        }
//
//    }
//    static boolean isMatched(String exp){
//        return (Pattern.matches("^[\\w]+(\\.[\\w]+)*@[\\w]+\\.[\\w]{2,}(\\.[\\w]{2})*$", exp));
    }
}
