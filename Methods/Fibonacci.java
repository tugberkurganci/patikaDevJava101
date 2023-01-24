package Methods;

import java.util.ArrayList;

public class Fibonacci {
    public int fibo(int seriesNumber){

        if (seriesNumber==0)return 0;
        if (seriesNumber==1)return 1;




        return fibo(seriesNumber-2)+fibo(seriesNumber-1);
    }
}
