package JavatPointArrayList.ComparatorExperiment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by rohit on 23/12/17.
 */
public class MainClass {
    public static void main(String args[]){

        ArrayList<StudentExample> al=new ArrayList<StudentExample>();
        al.add(new StudentExample(101,"Vijay",23));
        al.add(new StudentExample(106,"Ajay",27));
        al.add(new StudentExample(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al,new ComparatorTestName());
        for(StudentExample st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("=======================");

        System.out.println("sorting by age...");

        Collections.sort(al,new ComparatorTestAge());
        for(StudentExample st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
