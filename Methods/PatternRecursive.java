package Methods;

public class PatternRecursive {

    public void pattern(int number, int i) {
        if (i == 0) return;
        if (i == 1) {
            System.out.print(number + " ");
        }
        if (i >= 1) {
            int number2 = number - 5;
            System.out.print(number2 + " ");
            int alfa = i;


            if (number2 > 0) pattern(number2, i + 1);
            if (number2 <= 0) pattern(number, -alfa);
        }
        if (i < 1) {
            System.out.print(number + " ");
            pattern(number + 5, i + 1);
        }
    }


}


