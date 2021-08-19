import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
//        To the Util Class add temperaturConversion static function, given the temperature
//        in fahrenheit as input outputs the temperature in Celsius or viceversa using the
//                formula
//        Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
//        Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
        //Celsius to Fahrenheit:
        System.out.println("Enter the Temperature in degree Celsius: ");
        Scanner sc= new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Temperature in degree Celsius is: "+ temp);
        double far = (temp*9/5)+32;
        System.out.println("Temperature in degree fahrenheit is: "+ far);
        //Fahrenheit to Celsius:
        System.out.println("Enter the Temperature in degree Fahrenheit: ");
        Scanner tc= new Scanner(System.in);
         double farr = tc.nextDouble();
        System.out.println("Temperature in degree Fahrenheit is: "+ farr);
        double tempr = (farr-32)*5/9;
        System.out.println("Temperature in degree fahrenheit is: "+ tempr);
    }
}
