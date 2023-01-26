package Series;

import java.util.Arrays;

public class MaxMinFinder {
    public static void finder(int[] arr, int number1) {

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);

        newArr[newArr.length - 1] = number1;
        //also you can use this sort function
        /*
        for (int i = 0; i < newArr.length; i++) {

            for (int j = i + 1; j < newArr.length; j++) {

                int temp = newArr[i];

                if (newArr[i] > newArr[j]) {

                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        */

        Arrays.sort(newArr);
        int a = Arrays.binarySearch(newArr, number1);
        if (a > 0 && a < arr.length - 1) {
            System.out.println("Nearest major number:" + newArr[a + 1]);
            System.out.println("Nearest small number:" + newArr[a - 1]);
        } else if (a == 0) {
            System.out.println("smallest number of array :" + number1);
            System.out.println("Nearest major number:" + newArr[a + 1]);
        } else if (a == arr.length) {
            System.out.println("largest number of array :" + number1);
            System.out.println("Nearest small number:" + newArr[a - 1]);
        }
    }
}
