import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Enter a Alphabet: ");
        Scanner sc = new Scanner(System.in);
//        char ch =sc.next();
        char ch=sc.next( ).charAt(0);
        System.out.println(ch);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("Alphabet is a Vowel");
            }
            else {
                System.out.println("Alphabet is a Consonant");
            }



    }
}
