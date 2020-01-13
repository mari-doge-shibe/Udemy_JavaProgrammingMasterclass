public class ComplexNumber {
    private double real;
    private double imaginary;
/* this constrcutor is not needed to pass the test
    public ComplexNumber() {
        this(0, 0);
    }

 */

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;

    }
    public void add(ComplexNumber z1) {
        add(z1.real, z1.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber z1) {
        subtract(z1.real, z1.imaginary);
    }



}
