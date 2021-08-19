import java.util.Scanner;

public class Problem3 {
    //Power of 2
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
//        System.out.println(num);
        int a =1;
        for(int i=0; i<=num; i++){
            System.out.println("2^"+i+" = "+a);
            a=a*2;
        }

    }
}


