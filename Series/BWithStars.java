package Series;

import java.util.Arrays;

public class BWithStars {
    public static void printB() {

        String[][] b = new String[7][4];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == 0 || i == 3 || i == 6) {

                    b[i][j] = "*";
                } else {
                    if (j == 1 || j == 2) b[i][j] = " ";
                    else b[i][j] = "*";
                }


            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
