public class Problem1 {
    //Flip a Coin
    public static void main(String[] args) {
        System.out.println("Flip a Coin");
        int heads=0;
        int tails=0;
        for (int i=1; i<=10; i++){
            double num = Math.floor(Math.random()*10)%2;
            System.out.println("CoinToss Value: "+num);
            if (num==1){
                System.out.println("It is Heads");
                heads++;
            }
            else if (num==0){
                System.out.println("It is Tails");
                tails++;
            }
        }
        System.out.println("Total No. of Heads "+ heads);
        System.out.println("Total No. of Tails "+ tails);
        int percentHead=(heads*100/10);
        int percentTail=(tails*100/10);
        System.out.println("Percentage of Heads "+ percentHead +" %");
        System.out.println("Percentage of Tails "+ percentTail+" %");
    }
}
