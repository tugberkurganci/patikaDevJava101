package Loops;

import java.util.Scanner;

public class Combination {
    public void comb() {
        //Formula C(n,r) = n! / (r! * (n-r)!)

        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();
        int numberR = scanner.nextInt();

        int sumOfNFac = 1;
        int sumOfRFac = 1;
        int sumOfNMinesRFac = 1;


        for (int i = 1; i <= numberN; i++) {
            sumOfNFac = sumOfNFac * i;
        }
        for (int i = 1; i <= numberR; i++) {
            sumOfRFac = sumOfRFac * i;
        }
        for (int i = 1; i <= numberN-numberR; i++) {
            sumOfNMinesRFac = sumOfNMinesRFac * i;
        }

        int resultOfCombination = sumOfNFac / (sumOfRFac * (sumOfNMinesRFac));
        System.out.println("result Of Combination:"+resultOfCombination);
    }

}
