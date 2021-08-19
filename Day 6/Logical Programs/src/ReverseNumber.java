import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int reverse=0;
//      System.out.println("Number is:"+ number);
        while(number>0){
           int a=number%10;
           int b=number/10;
           reverse=reverse*10+a;
           number=b;

        }
        System.out.println("Reverse of a Number is: "+ reverse);


    }
}
