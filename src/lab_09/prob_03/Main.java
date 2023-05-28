package lab_09.prob_03;

import java.util.Collections;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Student> catalog = new Vector();
        Student s1 = new Student("Becali");
        Student s2 = new Student("Vintu");
        Student s3 = new Student("Arnauskis");
        catalog.add(s1);
        catalog.add(s2);
        catalog.add(s3);
        ((Student)catalog.get(0)).addMedie(5.0);
        ((Student)catalog.get(0)).addMedie(8.0);
        ((Student)catalog.get(0)).addMedie(8.0);
        ((Student)catalog.get(1)).addMedie(8.0);
        ((Student)catalog.get(1)).addMedie(3.0);
        ((Student)catalog.get(1)).addMedie(5.0);
        ((Student)catalog.get(2)).addMedie(7.0);
        ((Student)catalog.get(2)).addMedie(9.0);
        ((Student)catalog.get(2)).addMedie(10.0);
        Collections.sort(catalog);
        System.out.println(((Student)catalog.get(0)).toString());
        System.out.println(((Student)catalog.get(1)).toString());
        System.out.println(((Student)catalog.get(2)).toString());
    }
}
