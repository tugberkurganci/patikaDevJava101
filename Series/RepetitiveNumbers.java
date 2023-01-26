package Series;

import java.util.ArrayList;

public class RepetitiveNumbers {
    // 2 3 2 2 4 5 6 6 6 8
    public static void rep(int[] arr1) {
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        for (int alfa : arr1) {
            arr.add(alfa);
        }

        for (int i = 0; i < arr.size(); i++) {
            counter = 0;
            for (int j = i + 1; j < arr.size(); j++) {

                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    counter++;
                }
            }
            if (counter < 1) {
                arr.remove(i);
                i--;
            }
        }

        for (int beta : arr
        ) {
            if (beta % 2 == 0)
                System.out.println(beta);
        }
    }
}



