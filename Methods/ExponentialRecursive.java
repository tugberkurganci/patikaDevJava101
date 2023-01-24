package Methods;

public class ExponentialRecursive {
    public int exp(int base,int uppper){

        if (uppper==0)return 1;

   return base*exp(base,uppper-1);

    }
}
