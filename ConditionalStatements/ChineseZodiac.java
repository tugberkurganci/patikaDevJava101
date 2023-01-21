package ConditionalStatements;

import java.util.Scanner;

public class ChineseZodiac {
    public void zodiac() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        int birthYear = scanner.nextInt();

        if (birthYear % 12 == 0) System.out.println("Your zodiac is " + "Monkey");
        if (birthYear % 12 == 1) System.out.println("Your zodiac is " + "Rooster");
        if (birthYear % 12 == 2) System.out.println("Your zodiac is " + "Dog");
        if (birthYear % 12 == 3) System.out.println("Your zodiac is " + "Pig");
        if (birthYear % 12 == 4) System.out.println("Your zodiac is " + "mouse");
        if (birthYear % 12 == 5) System.out.println("Your zodiac is " + "bullock");
        if (birthYear % 12 == 6) System.out.println("Your zodiac is " + "tiger");
        if (birthYear % 12 == 7) System.out.println("Your zodiac is " + "rabbit");
        if (birthYear % 12 == 8) System.out.println("Your zodiac is " + "dragon");
        if (birthYear % 12 == 9) System.out.println("Your zodiac is " + "snake");
        if (birthYear % 12 == 10) System.out.println("Your zodiac is " + "horse");
        if (birthYear % 12 == 11) System.out.println("Your zodiac is " + "ship");


    }
}
