import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int factor=0;
        int fact=0;

        for (int i=1; i<num;i++){
            if (num%i==0){
                System.out.println(i+" is Factor of Number: "+num);
                fact=i;
                System.out.println("fact "+fact);
                factor+=fact;
           }

//            System.out.println("factor sum "+factor);
        }
        System.out.println("Sum of the factors: "+ factor);
        if (factor==num){
            System.out.println("Number is a Perfect Number");
        }
        else{
            System.out.println("Number is Not a Perfect Number");
        }

    }
}
