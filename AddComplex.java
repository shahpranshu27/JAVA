public class AddComplex {
    double real;
    double imag;

    public AddComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        AddComplex n1 = new AddComplex(2.3, 4.5),
                n2 = new AddComplex(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static AddComplex add(AddComplex n1, AddComplex n2)
    {
        AddComplex temp = new AddComplex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
