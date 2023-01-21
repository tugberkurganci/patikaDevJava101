package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {

    public void isLeap(int year) {

        if (year % 4 == 0) {

            if (year % 100 == 0 && !(year % 400 == 0)) {
                System.out.println("this not leap year");
            } else System.out.println("this is leap year");

        }else {
            System.out.println("this is not leap year");
        }


    }
}
