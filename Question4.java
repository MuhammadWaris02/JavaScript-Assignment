import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Calculate Selling Price");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter Discounted Price:");
        double final_price;
        final_price = read.nextDouble();

        System.out.println("Enter Dicounted Percentage:");
        double discount;
        discount = read.nextDouble();

        System.out.println("Selling Price:");
        double initial_price;
        double p = 1 - (discount / 100);
        initial_price = final_price / p;
        System.out.println(initial_price);

        read.close();
    }
}
