import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by rohit on 16/09/17.
 */
public class FileCreate {

    private Formatter x;


    public void openFile(){

        try {
            x = new Formatter("/Users/rohit/Downloads/ganthade.txt");
        }
        catch (Exception e){
            System.out.println("You have an error ");
        }
    }

    public void addRecords(){
        x.format("%s%s%s", "99 ", "Rohit ", "Ganthade");
    }

    public void close(){
        x.close();
    }

    private Scanner scanner;

    public void openFile1(){

        try {
            scanner = new Scanner(new File("/Users/rohit/Downloads/test.txt"));
        }
        catch (Exception e){
            System.out.println("You have an error ");
        }
    }

    public void readFile(){
        while ((scanner.hasNext())){

//            String str[] = new String[3];
//
//            for (int i=0; i<str.length; i++){
//                str[i] = scanner.next();
//                System.out.println(str[i] + " ");
//            }
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();

            System.out.printf("%s %s %s \n", a, b, c);

        }
    }



}
