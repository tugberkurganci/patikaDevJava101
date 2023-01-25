package Classes.BoxGame;

public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    public Ring() {
    }

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (this.f1.weight < maxWeight && this.f1.weight > minWeight && this.f2.weight < maxWeight && this.f2.weight > minWeight) {
            while (this.f1.health >= 0 && this.f2.health >= 0) {
                System.out.println("round started");
                double criteria=whoAttack();
                if (criteria< 50.0) {
                    f1.hit(f2);
                    if (f2.health <= 0) {
                        System.out.println(this.f1.name+"  won");
                        break;
                    }
                } else {
                    f2.hit(f1);
                    if (f1.health <= 0) {
                        System.out.println(this.f2.name+"  won");
                        break;
                    }
                }
            }


        }else System.out.println("weights not supported");
    }

    public double whoAttack() {
        double randomNumber = Math.random() * 100;

        return randomNumber;
    }


}
