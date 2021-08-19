import java.util.Scanner;

public class Problem2 {
    //Leap Year
    public static void main(String[] args) {
        System.out.println("Check whether given Year is Leap Year or Not: ");
        System.out.println("Enter a 4 digit Number: ");
        Scanner yr = new Scanner(System.in);
        int year =yr.nextInt();
//        System.out.println(year);
        if (year%400==0){
            System.out.println(year+" Year is a Leap Year");
        }
        else if (year%100==0){
                    System.out.println(year+" Year is not a Leap Year");
        }
        else if (year%4==0){
            System.out.println(year+" Year is a Leap Year");
        }
        else{
            System.out.println(year+" Year is not a Leap Year");
        }
    }
}
