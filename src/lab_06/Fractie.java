package lab_06;

public class Fractie {
    private int numerator;
    private int denominator;

    public Fractie(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fractie() {
        this(0, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public String toString() {
        return "The value of " + this.numerator + '/' + this.denominator + " is " + this.numerator / this.denominator;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Fractie other = (Fractie) obj;

        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    public static void main(String[] args) {
        Fractie f1 = new Fractie(3, 4);
        Fractie f2 = new Fractie(2, 3);

        System.out.println(f1.toString());
        System.out.println(f1.equals(f2));
    }
}
