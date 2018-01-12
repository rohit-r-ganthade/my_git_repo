package JavatPointArrayList.ComparatorExperiment;

import java.util.Comparator;

/**
 * Created by rohit on 23/12/17.
 */
public class ComparatorTestAge implements Comparator<StudentExample> {
    public int compare(StudentExample o1,StudentExample o2){
        StudentExample s1 = o1;
        StudentExample s2 = o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
