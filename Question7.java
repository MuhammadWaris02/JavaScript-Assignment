import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Tell a number is Even or Odd");
        System.out.println("");

        Scanner read;
        read= new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int x;
        x= read.nextInt();

        if (x % 2 == 1) {
            System.out.println("It is a Odd Number");
        } else {
            System.out.println("It is an Even Number");
        }

        read.close();
    }
}
