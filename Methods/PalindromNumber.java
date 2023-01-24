package Methods;

public class PalindromNumber {
    public boolean palindrom(int number){

        String changedNumber= String.valueOf(number);

        int i=0;
        boolean isPalidrom=true;
        while (!(i==changedNumber.length()/2)){
        if (changedNumber.charAt(i)==changedNumber.charAt(changedNumber.length()-i-1))isPalidrom=true;
        else isPalidrom=false;
        i++;}

        return isPalidrom;
    }
}
