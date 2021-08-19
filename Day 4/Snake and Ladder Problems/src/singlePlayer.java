import java.util.Scanner;

public class singlePlayer {
    public static void main(String[] args) {
//        System.out.println("Throw a dice: ");
        Scanner dice = new Scanner(System.in);
//        int num=dice.nextInt();
//        System.out.println(num);
//        for (int i=1; i<=10; i++) {
        double sum = 0;
        int diceThrows = 0;
        //Ladders = 15,33,49,67,83
        //Snakes = 21,35,51,73,92
        while (sum<100) {
            System.out.println("Throw a dice: ");
            diceThrows++;
            double num = ((Math.floor(Math.random() * 10) % 6) + 1);
            //Eliminate dice value 0
            System.out.println("Dice value is: " + num);
            if(sum==94) {
//                System.out.println("Player stays in Same Position");
                int[] s1 = {1, 2, 3, 4, 5, 6};
                for (int e1 : s1) {
                    if (num == e1) {
                        sum += num;
                    }
                }
            }
            else if(sum==95) {
//           System.out.println("Player stays in Same Position");
                int[] s2 = {1, 2, 3, 4, 5};
                for (int e2 : s2) {
                    if (num == e2) {
                        sum += num;
                    }
                }
            }
            else if(sum==96) {
//           System.out.println("Player stays in Same Position");
                int[] s3 = {1, 2, 3, 4};
                for (int e3 : s3) {
                    if (num == e3) {
                        sum += num;
                    }
                }
            }

              else if(sum==97) {
//           System.out.println("Player stays in Same Position");
                int[] s4 = {1, 2, 3};
                for (int e4 : s4) {
                    if (num == e4) {
                        sum += num;
                    }
                }
            }
              else if(sum==98) {
//           System.out.println("Player stays in Same Position");
                int[] s5 = {1, 2};
                for (int e5 : s5) {
                    if (num == e5) {
                        sum += num;
                    }
                }
            }
              else if(sum==99) {
//           System.out.println("Player stays in Same Position");
                int[] s6 = {1};
                for (int e6 : s6) {
                    if (num == e6) {
                        sum += num;
                    }
                }
            }
          else {
                sum += num;
            }

            int[] ladder = {15, 33, 49, 67, 83};
            int[] snake = {21, 35, 51, 73, 92};
            for (int e : ladder) {
                if (sum == e) {
                    sum += num;
                    System.out.println("Ladder!!!");
                }

            }
                for (int s : snake) {
                    if (sum == s) {
                         sum =sum-num;
                        System.out.println("Snake@@@");
                    }
                }
            System.out.println("Sum of the dice is: " + sum);
        }
//        System.out.println("Sum of the dice is: " + sum);
        System.out.println("Number of dice throws: " + diceThrows);
        if (sum==100){
            System.out.println("Congratulations! You won the Game..");
        }
    }
}

