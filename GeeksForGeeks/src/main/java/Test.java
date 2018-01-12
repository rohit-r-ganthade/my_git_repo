import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();

        int out_ = SmallestSubString(S);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int SmallestSubString(String S){
        // Write your code here
        int n = S.length();

        int max_distinct = smallestSubStr(S);
        int minl = n;

        for (int i=0 ;i<n ;i++){
            for (int j=i; j<n; j++){
                String subs =  S.substring(i,j+1);
                int subs_lenght = subs.length();
                int sub_distinct_char = smallestSubStr(subs);

                if (subs_lenght < minl && max_distinct == sub_distinct_char){
                    minl = subs_lenght;
                }
            }
        }
        return minl;
    }

    static int smallestSubStr(String str){
        int length = str.length();
        int NO_OF_CHARS =256;
        int count[] = new int[NO_OF_CHARS];
        for(int i=0; i< NO_OF_CHARS ;i++)
            count[i]=0;

        for(int j=0; j<length ;j++)
            count[str.charAt(j)]++;

        int max_distinct = 0;
        for(int i=0; i< NO_OF_CHARS ; i++){
            if(count[i] != 0 )
                max_distinct++;
        }
        return max_distinct;
    }
}