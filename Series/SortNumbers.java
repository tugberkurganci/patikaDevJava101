package Series;

public class SortNumbers {

    public static void sort(int[] arr) {

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
