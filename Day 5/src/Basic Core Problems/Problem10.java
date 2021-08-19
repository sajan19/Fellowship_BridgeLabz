    public class Problem10 {
    public static void main(String[] args) {
        //Find the Largest among Three Numbers
        int a =56;
        int b =89;
        int c =34;
        System.out.println("Numbers are " + a + " " + b + " " + c);
        if (a>b && a>c){
            System.out.println("Largest among the Numbers is "+ a);
        }
        else if (b>a && b>c){
            System.out.println("Largest among the Numbers is "+ b);
        }
        else if (c>a && c>b){
            System.out.println("Largest among the Numbers is "+ c);
        }

    }
}
