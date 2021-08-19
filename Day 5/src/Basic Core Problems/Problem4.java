import java.util.Scanner;

public class Problem4 {
    //Harmonic Number
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        float num =sc.nextFloat();
        float harmonic=1;
        for (float i=2; i<=num; i++){
            harmonic=harmonic+1/i;
        }
        System.out.println("value of nth Harmonic Value: "+ harmonic);

    }
}


