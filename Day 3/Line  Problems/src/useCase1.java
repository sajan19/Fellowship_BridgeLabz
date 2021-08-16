import java.lang.Math;
public class useCase1 {
    public static void main(String[] args) {
        //Coordinates of Point P be x1 & y1
        double x1 =5;
        double y1 =3;
        //Coordinates of Point Q be x2 & y2
        double x2 =8;
        double y2 =10;
        double length;
        double num1 =x2-x1;
        double num2 =y2-y1;
        double cordinate1=Math.pow(num1, 2);
        double cordinate2=Math.pow(num2, 2);
        System.out.println(cordinate1);
        System.out.println(cordinate2);
        length =Math.sqrt(cordinate1+cordinate2);
        System.out.println("Length of the Line is: "+ length);

    }
}
