package lab_09.prob_03;

public class Student implements Persoana {
    private String nume = new String();

    private int medii_length = 0;

    private double[] medii;

    public Student(String nume) {
        this.medii = new double[this.medii_length];
        this.nume = nume;
    }

    public double calculMedieGenerala() {
        double sum = 0.0;

        for(int i = 0; i < this.medii_length; ++i) {
            sum += this.medii[i];
        }

        return sum / (double)this.medii_length;
    }

    public int compareTo(Object o) {
        Student obj = (Student)o;
        if (this.nume.compareTo(obj.nume) != 0) {
            return this.nume.compareTo(obj.nume);
        } else if (this.calculMedieGenerala() - obj.calculMedieGenerala() > 0.0) {
            return -1;
        } else {
            return this.calculMedieGenerala() - obj.calculMedieGenerala() < 0.0 ? 1 : 0;
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addMedie(double medie) {
        ++this.medii_length;
        double[] aux = this.medii;
        this.medii = new double[this.medii_length];

        for(int i = 0; i < this.medii_length - 1; ++i) {
            this.medii[i] = aux[i];
        }

        this.medii[this.medii_length - 1] = medie;
    }

    public String toString() {
        return this.nume + " - " + this.calculMedieGenerala();
    }
}
