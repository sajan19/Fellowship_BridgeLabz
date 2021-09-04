import java.util.Scanner;

public class Sample {
    String firstName;
    String lastName;
    public static void ContactBook(){
        System.out.println("Address Book Details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next();
//        System.out.println("First Name: "+ firstName);
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println("First Name: "+ firstName +","+" Last Name: "+ lastName);
    }
    //    class Demo extends AddressBookSystem{
    public static void newContact(){
        boolean bravo = false;
        System.out.println("Want to Enter New Contact Details?");
        Scanner c = new Scanner(System.in);
        bravo=c.nextBoolean();

        if (bravo) {
            System.out.println("Enter New Contact Details ");
            ContactBook();
        }
        else{
            System.out.println("Have a Good Day!");
        }
    }
    public static void main(String[] args) {
        ContactBook();
        newContact();
//        AddressBookSystem hell = new demo();
//        hell.newContact();
    }
}
