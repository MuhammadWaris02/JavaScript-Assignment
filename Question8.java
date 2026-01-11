import java.util.Scanner;
import java.lang.Math;
public class Question8 {
    public static void main(String[] args) {
         System.out.println("Area Of Triangle using Heron's Formula:");
         System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter length of first side 'a' of triangle:");
        double a;
        a= read.nextDouble();

        System.out.println("Enter length of second side 'b' of triangle:");
        double b;
        b= read.nextDouble();

        System.out.println("Enter length of third side 'c' of triangle:");
        double c;
        c= read.nextDouble();


        System.out.println("Area of triangle:");
        double s;
        double Area;
        s = (a + b + c) / 2;
        // formula s * (s-a)(s-b)(s-c)
        // 1st bracket
        double br_a = s-a;
        // 2nd bracket
        double br_b = s-b;
        // 3rd bracket
        double br_c = s-c;
        // multiply above brackets
        double final_s = br_a * br_b * br_c;
        // multiply final bracket with s
        double last_ans = s* final_s;

        // taking sq root of the answer
        Area = Math.sqrt(last_ans);
        System.out.println(Area);

        read.close();
    }
}
