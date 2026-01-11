import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Calculate Area of Trapezoid");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter length of first parallel side 'a':");
        double side_a;
        side_a= read.nextDouble();

        System.out.println("Enter length of second parallel side 'b':");
        double side_b;
        side_b= read.nextDouble();

        System.out.println("Enter length of the perpendicular distance between them 'h':");
        double height_h;
        height_h= read.nextDouble();

        System.out.println("Area of Trapezoid 'K':");
        double Area_K;
        Area_K = height_h * (side_a + side_b) / 2;
        System.out.println(Area_K);

        read.close();
    }
}
