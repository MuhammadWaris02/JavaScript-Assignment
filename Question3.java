import java.util.Scanner;
//import java.lang.Math;
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Calculate Discounted Price");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter Selling Price:");
        double initial_price;
        initial_price = read.nextDouble();

        System.out.println("Enter Dicounted Percentage:");
        double discount;
        discount = read.nextDouble();

        System.out.println("Discounted Price:");
        double final_price;
        double p = (discount / 100) * initial_price ;
        final_price = initial_price - p;
        System.out.println(final_price);

        read.close();
    }
}
