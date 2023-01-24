package Methods;

import java.util.Scanner;

public class PrimeRecursive { //5 4 3 2 1

    public void isPrime(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number=scanner.nextInt();
        boolean isPrime=prime(number,2);
        if (isPrime) System.out.println("prime");else System.out.println("this is not prime");
    }
    public boolean prime(int number, int start) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number == start) {

            return true;

        }
        if (number % start == 0) {

            return false;
        }
        return prime(number,start+1);

    }
    }


