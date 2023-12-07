package Figures;

public class Triangle extends Figure {
    private int A;
    private int B;
    private int C;

    public Triangle(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
