package Series;

public class HarmonicAverage {
    public static double harmonica(int [] arr){
        double average=0;
        double harmonic=0;
        double total=0;
        for (int i = 0; i < arr.length ; i++) {
            harmonic=0;
            for (int j = 1; j <=arr[i] ; j++) {

                harmonic+=1.00/j;
            }
            total+=harmonic;
        }
            average=total/arr.length;
        return average;
    }
}
