import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        for (int i=1; i<=num;i++){
            if (num%i==0){
                System.out.println(i+" is Factor of Number: "+num);

            }
        }

    }
}
