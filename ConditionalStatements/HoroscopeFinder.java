package ConditionalStatements;

public class HoroscopeFinder {
    public void find(int month,int day){

        if (month==1){
            if (day<22) System.out.println("oğlak");
            else System.out.println("kova");
        }
        if (month==2){
            if (day<20) System.out.println("kova");
            else System.out.println("balık");
        }
        if (month==3){
            if (day<21) System.out.println("balık");
            else System.out.println("koç");
        }
        if (month==4){
            if (day<21) System.out.println("koç");
            else System.out.println("boğa");
        }
        if (month==5){
            if (day<22) System.out.println("boğa");
            else System.out.println("ikizler");
        }
        if (month==6){
            if (day<23) System.out.println("ikizler");
            else System.out.println("yengeç");
        }
        if (month==7){
            if (day<23) System.out.println("yengeç");
            else System.out.println("aslan");
        }
        if (month==8){
            if (day<24) System.out.println("aslan");
            else System.out.println("başak");
        }
        if (month==9){
            if (day<24) System.out.println("başak");
            else System.out.println("terazi");
        }
        if (month==10){
            if (day<24) System.out.println("terazi");
            else System.out.println("akrep");
        }
        if (month==11){
            if (day<24) System.out.println("akrep");
            else System.out.println("yay");
        }
        if (month==12){
            if (day<23) System.out.println("yay");
            else System.out.println("oğlak");
        }

    }
}
