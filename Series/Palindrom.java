package Series;

public class Palindrom {
    public boolean palindrom(String  x){



        int i=0;
        boolean isPalidrom=true;
        while (!(i==x.length()/2)){
            if (x.charAt(i)==x.charAt(x.length()-i-1))isPalidrom=true;
            else isPalidrom=false;
            i++;}

        return isPalidrom;
    }
}