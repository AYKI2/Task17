public class Pentagon extends Shape{
    private int d;
    private int e;

    public Pentagon() {
    }

    public Pentagon(int a, int b, int c, int d, int e) {
        super(a, b, c);
        this.d = d;
        this.e = e;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+getC()+getD()+getE();
    }

    @Override
    public String toString() {
        return "\nPentagon: \n" +super.toString()+
                "\nd = " + d +
                "\ne = " + e;
    }
}
