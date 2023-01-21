package Basic;

import java.util.Scanner;

public class GroceryStore {

    public void kilo(){
        Scanner scanner=new Scanner(System.in);

        double pear=2.14;
        double apple=3.67;
        double tomato=1.11;
        double banana=0.95;
        double aubergine=5.00;

        System.out.println("How much pear");
        double pearkg= scanner.nextInt();
        System.out.println("How much apple");
        double applekg= scanner.nextInt();
        System.out.println("How much tomato");
        double tomatokg= scanner.nextInt();
        System.out.println("How much banana");
        double bananakg= scanner.nextInt();
        System.out.println("How much aurbergine");
        double auberginekg= scanner.nextInt();

        double result=(pearkg*pearkg)+(applekg*apple)+(tomato*tomatokg)+(banana*bananakg)+(aubergine*auberginekg);

        System.out.println(result);

    }
}
