package lab_06;

import javax.lang.model.element.RecordComponentElement;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imaginary + "i)";
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this(1, 2);
    }

    public ComplexNumber add(double real, double imaginary) {
        return new ComplexNumber(this.real + real, this.imaginary + imaginary);
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(this.real + c.real, this.imaginary + c.imaginary);
    }

    public ComplexNumber addReal(double re) {
        return new ComplexNumber(this.real + re, this.imaginary);
    }

    public ComplexNumber addIm(double im) {
        return new ComplexNumber(this.real, this.imaginary + im);
    }

    public ComplexNumber subtract(double real, double imaginary) {
        return new ComplexNumber(this.real - real, this.imaginary - imaginary);
    }

    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(this.real - c.real, this.imaginary - c.imaginary);
    }

    public ComplexNumber subtractRe(double re) {
        return new ComplexNumber(this.real - real, this.imaginary);
    }

    public ComplexNumber subtractIm(double im) {
        return new ComplexNumber(this.real, this.imaginary - im);
    }

    public double absValue() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(-1, 3);

        ComplexNumber sum = a.add(b);
        ComplexNumber diff = a.subtract(b);

        System.out.println("a + b = " + sum.toString());
        System.out.println("a - b = " + diff.toString());
        System.out.println("|a| = " + a.absValue());
        System.out.println("|b| = " + b.absValue());
    }
}
