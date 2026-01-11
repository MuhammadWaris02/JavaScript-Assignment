import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Calculate Power Consumption");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter Ampere:");
        double amp;
        amp= read.nextDouble();

         System.out.println("Enter Volts:");
        double volt;
        volt = read.nextDouble();

        System.out.println("Power Consumption:");
        double Watts;
        Watts = amp * volt;
        System.out.print(Watts);
        System.out.println(" Watts");

        read.close();
    }
}
