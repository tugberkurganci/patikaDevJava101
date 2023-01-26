package Series;

import java.util.Scanner;

public class SortNumbers {

    public static void sort(int number1) {
        Scanner scanner=new Scanner(System.in);
        int[] arr =new int[number1];

        for (int i = 0; i <number1 ; i++) {
            System.out.print("enter the"+(i+1) +"number:");
            int number2=scanner.nextInt();

                arr[i]=number2;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = arr[i];

                if (arr[i] > arr[j]) {

                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int number : arr
        ) {
            System.out.print(number+ " ");

        }
    }
}
