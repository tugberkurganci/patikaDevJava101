package Classes.BoxGame;

public class Fighter {

    String name;
    int damage;
    int health;
    double dodge;

    public Fighter() {
    }

    int weight;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {

        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage <= 0){
            foe.health=0;
            return 0;}else foe.health= foe.health-this.damage;

        return foe.health - this.damage;
    }

    public boolean dodge() {

        boolean isDodge = false;

        double number1 = Math.random() * 100;

        if (this.dodge <= number1) {
            isDodge = true;
        } else {
            isDodge = false;
        }

        return isDodge;
    }


}
