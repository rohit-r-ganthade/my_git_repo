package JavatPointArrayList.ComparatorExperiment;

import java.util.Comparator;

/**
 * Created by rohit on 23/12/17.
 */
public class ComparatorTestName implements Comparator<StudentExample> {
    @Override
    public int compare(StudentExample o1, StudentExample o2) {
        return o1.name.compareTo(o2.name);
    }
}
