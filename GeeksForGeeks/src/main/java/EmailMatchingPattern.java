import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by rohit on 02/12/17.
 */
public class EmailMatchingPattern {
    public static void main(String[] args)throws Exception
    {

        File file = new File("/Users/rohit/Desktop/Test/abc.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);


        BufferedReader br = new BufferedReader(new FileReader(file));

        try {

            String content = "This is the content to write into file\n";

            bw.write(content);
            bw.newLine();
            bw.write("I am good rohit.ganthade@gmail.com and ana.ana@dkd.dm and ASD.DD@ASd.Saa");
            bw.flush();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        }
        String st;
        while ((st = br.readLine()) != null) {
           // System.out.println(st);

            List<String> list = Arrays.asList(st.split(" "));
            for (String ele : list) {
                if (isMatched(ele))
                    System.out.println(ele);
            }
        }
    }
    static boolean isMatched(String exp){
        return (Pattern.matches("^[\\w]+(\\.[\\w]+)*@[\\w]+\\.[\\w]{2,}(\\.[\\w]{2})*$", exp));
    }
}
