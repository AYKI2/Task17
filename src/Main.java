import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        int a = random.nextInt(1,50);
        int b = random.nextInt(1,50);
        int c = random.nextInt(1,50);
        int d = random.nextInt(1, 50);
        int e = random.nextInt(1, 50);
        Shape square = new Square(a,a,a,a);
        System.out.println(square);
        System.out.println("Perimeter: "+square.getPerimeter());

        Shape rectangle = new Rectangle(a,b,a,b);
        System.out.println(rectangle);
        System.out.println("Perimeter: "+rectangle.getPerimeter());

        Shape pentagon = new Pentagon(a,b,c,d,e);
        System.out.println(pentagon);
        System.out.println("Perimeter: "+pentagon.getPerimeter());

        Shape triangle = new Triangle(a,b,c);
        System.out.println("\nTriangle:");
        System.out.println(triangle);
        System.out.println("Perimeter: "+triangle.getPerimeter());
    }
}