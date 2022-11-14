public class Triangle extends Shape{
    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC();
    }
}
