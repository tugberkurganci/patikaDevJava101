package Basic;

public class KdvAmount {

    public void kdv(int amount) {

        if (amount < 1000 && amount > 0) {
            int withoutKdv = amount;
            int withkdv = amount + (amount / 100 * 18);
            int kdvAmount = amount / 100 * 18;

            System.out.println("With out kdv="+withoutKdv+" With kdv="+withkdv+" Kdv amount="+kdvAmount);
        } else {

            int withoutKdv2 = amount;
            int withkdv2 = amount + (amount / 100 * 8);
            int kdvAmount2 = amount / 100 * 8;
            System.out.println("With out kdv="+withoutKdv2+" With kdv="+withkdv2+" Kdv amount="+kdvAmount2);
        }

    }

}

