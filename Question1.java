import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Percentage Of High School Students");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Write your Obtianed Marks:");
        double om;
        om = read.nextDouble();

        System.out.println("Write your Maximum Marks:");
        double mm;
        mm = read.nextDouble();
       
        System.out.println("Percentage:");
        double p;
        p = (om / mm) * 100;

        System.out.println(p);

        read.close();
    }

}
