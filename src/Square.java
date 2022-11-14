public class Square extends Shape{
    private int d;

    public Square() {
    }

    public Square(int a, int b, int c, int d) {
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
        return getA() * 4;
    }

    @Override
    public String toString() {
        return "\nSquare: \n" +super.toString()+
                "\nd = " + d;
    }
}
