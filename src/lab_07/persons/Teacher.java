package lab_07.persons;

import java.util.Vector;

public class Teacher extends Person {
    public Vector<String> courses = new Vector<String>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        } else {
            courses.add(course);
            return true;
        }
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        } else {
            return false;
        }
    }
}
