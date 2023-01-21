package ConditionalStatements;

import java.util.Arrays;

public class NumberSort {


    public void sort(int number1, int number2, int number3) {

        int[] numbers = new int[]{number1, number2, number3};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void sort2(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number2) System.out.println(number1 + "en büyüktür");
        else if (number2 > number3 && number2 > number1) {
            System.out.println(number2 + "en büyüktür");
        } else System.out.println(number3 + "en büyüktür");
    }

}
