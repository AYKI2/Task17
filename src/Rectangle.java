public class Rectangle extends Shape{
    private int d;

    public Rectangle() {
    }

    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC()+getD();
    }

    @Override
    public String toString() {
        return "\nRectangle: \n" +super.toString()+
                "\nd = " + d;
    }
}
