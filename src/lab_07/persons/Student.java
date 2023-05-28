package lab_07.persons;

import java.util.Vector;

public class Student extends  Person {

    public Vector<String> courses = new Vector<String>();
    public Vector<Integer> grades = new Vector<Integer>();

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades() {
        // Nu inteleg ce ar trebui sa faca aceasta functie
    }

    public double getAverageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
