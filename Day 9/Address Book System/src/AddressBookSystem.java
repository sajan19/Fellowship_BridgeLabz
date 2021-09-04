import java.util.Objects;
import java.util.Scanner;

public class AddressBookSystem {

    String firstName;
    String lastName;
    public static void ContactBook(){
        System.out.println("Address Book Details...");
        String [] UserInfo =  new String[10];
//        for(int i = 0; i<UserInfo.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = sc.next();
            UserInfo[0]=firstName;

            System.out.println("Enter Last Name");
            String lastName = sc.next();
            UserInfo[1]=lastName;

            System.out.println("Enter your City");
            String city = sc.next();
            UserInfo[2]=city;

            System.out.println("Enter your State");
            String state = sc.next();
            UserInfo[3]=state;

            //Display the Output
            System.out.println("First Name: "+ UserInfo[0]+" Last Name: "+ UserInfo[1]+" City: "+ UserInfo[2]+
                    " State: "+ UserInfo[3]);

//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Name");
//        String firstName = sc.next();
////        System.out.println("First Name: "+ firstName);
//        System.out.println("Enter Last Name");
//        String lastName = sc.next();
//        System.out.println("First Name: "+ firstName +","+" Last Name: "+ lastName);
    }
//    class Demo extends AddressBookSystem{
        public static void newContact(){
//            String yes = null;
            String bravo = "yes";
            System.out.println("Want to Enter New Contact Details? (yes/no) ");
            Scanner c = new Scanner(System.in);
            bravo=c.next();
                       if (Objects.equals(bravo, "yes")) {
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
        newContact();
//        AddressBookSystem hell = new demo();
//        hell.newContact();
    }
}
