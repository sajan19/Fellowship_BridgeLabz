import java.util.Scanner;

public class FibonacciSeries {
    static void fibo(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=1; i<n-1; i++){
//            System.out.print(n3+" ");
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Fibonacci Series is as follows: ");
        fibo(num);
    }
}
