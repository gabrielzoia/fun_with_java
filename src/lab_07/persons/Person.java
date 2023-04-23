package lab_07.persons;

public class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Nume: " + this.name + "\nAdresa: " + this.address;
    }
}
