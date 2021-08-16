import java.util.Scanner;

public class useCase3 {
    public static void main(String[] args) {
        System.out.println("Length of 1st line is: ");
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();
        System.out.println("Length of Second line is: ");
        int length2 = sc.nextInt();
//        System.out.println("Length of 1st line is: "+ length1);
//        System.out.println("Length of 2nd line is: "+ length2);
        if (length1 == length2) {
            System.out.println("Lengths of two lines are equal");
        }
        else if (length1 > length2){
            System.out.println("Length of 1st line is greater than 2nd line");
        }
        else{
            System.out.println("Length of 1st line is less than 2nd line");
        }
    }
}
