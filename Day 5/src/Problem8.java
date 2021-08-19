import java.util.Scanner;

public class Problem8 {
    //Check Whether a Number is Even or Odd
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if (num%2==0){
            System.out.println("Number is Even");
        }
        else if (num%2==1){
            System.out.println("Number is Odd");
        }

    }
}
