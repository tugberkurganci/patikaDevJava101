package Basic;

public class TaxiFare {

    public void cost(double kilometres){

        double resultCost=10+(kilometres*2.20);

        if (resultCost<20) resultCost=20;

        System.out.println(resultCost);
    }
}
