package Series;

public class Tranpose {
    public static void  trans(int [][] arr){
        /*2 3 4
        5 6 4

        2 5
        3 6
        4 4*/


          int[][] arr2=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                arr2[i][j]=arr[j][i];
            }

        }
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j <arr2[0].length ; j++) {

                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();

        }



    }
}
