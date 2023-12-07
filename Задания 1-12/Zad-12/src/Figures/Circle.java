package Figures;

public class Circle extends Figure {
    private int A;


    public Circle(int a) {
        A = a;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "A=" + A +
                '}';
    }
}
