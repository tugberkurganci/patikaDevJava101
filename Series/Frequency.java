package Series;

public class Frequency { //  1 1 1 1 1 1 3 3 3 3 3 4
                        // 0 5 0 4 1
    public static void mode(int [] arr){
        int max=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){max=arr[i];}
        }

        int [] newArr=new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]=newArr[arr[i]]+1;

        }
        for (int i = 0; i <newArr.length ; i++) {
            if(newArr[i]>0){

                System.out.println(i+" sayısı "+newArr[i]+" kadar tekrar etti");
            }
        }

    }
}
