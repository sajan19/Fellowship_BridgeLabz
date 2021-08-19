import java.util.Scanner;

public class Problem6 {
    //Compute Quotient and Remainder
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Enter a Divisor: ");
        Scanner dv = new Scanner(System.in);
        int div =dv.nextInt();
        int Quotient=num/div;
        System.out.println("Quotient is: "+ Quotient);
        int Remainder=num%div;
        System.out.println("Remainder is: "+ Remainder);

    }
}
