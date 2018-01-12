import java.io.File;
import java.util.Formatter;

/**
 * Created by rohit on 16/09/17.
 */
public class FileTest {

    public static void main(String args[]) {

        File x = new File("/Users/rohit/Downloads/bike-integration-2793336.apk");

        if (x.exists())
            System.out.println(x.getName() + " exists ");
        else
            System.out.println(x.getName() + " does not exists ");

        System.out.println("====================================================");

        final Formatter x1;

        try {
            x1 = new Formatter("/Users/rohit/Downloads/rohit.txt");
            System.out.println("You created a file");
        } catch (Exception e) {
            System.out.println("You cannot create a file");
        }

        System.out.println("====================================================");

        FileCreate fileCreate = new FileCreate();
        fileCreate.openFile();
        fileCreate.addRecords();
        fileCreate.close();

        System.out.println("====================================================");

        fileCreate.openFile1();
        fileCreate.readFile();
        fileCreate.close();

    }
}
