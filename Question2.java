import java.util.Scanner;
import java.lang.Math;
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Area Of a Circle");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Write Radius of the Circle:");
        double radius;
        radius = read.nextDouble();

        System.out.println("Circumference of Circle:" );
        double cf;
        cf = 2 * Math.PI * radius;
        System.out.println(cf);

        System.out.println("Area of Circle:");
        double area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
        
        read.close();
    }
}
