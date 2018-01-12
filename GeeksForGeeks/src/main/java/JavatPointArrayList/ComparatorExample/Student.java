package JavatPointArrayList.ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by rohit on 23/12/17.
 */
class Student{

    static class Student1{
        int rollno;
        String name;
        int age;
        Student1(int rollno,String name,int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student1 student1 = (Student1) o;

            if (rollno != student1.rollno) return false;
            if (age != student1.age) return false;
            return name != null ? name.equals(student1.name) : student1.name == null;
        }

        @Override
        public int hashCode() {
            int result = rollno;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            return result;
        }
    }

    static class AgeComparator implements Comparator<Student1> {
        public int compare(Student1 s1,Student1 s2){
            if(s1.age==s2.age)
                return 0;
            else if(s1.age>s2.age)
                return 1;
            else
                return -1;
        }
    }

    static class NameComparator implements Comparator<Student1>{
        public int compare(Student1 s1,Student1 s2){
            return s1.name.compareTo(s2.name);
        }
    }


    public static void main(String args[]){

        ArrayList<Student1> al=new ArrayList<Student1>();
        al.add(new Student1(101,"Vijay",23));
        al.add(new Student1(106,"Ajay",27));
        al.add(new Student1(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al,new NameComparator());
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al,new AgeComparator());
        for(Student1 st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }

}
