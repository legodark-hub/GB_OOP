package GB_OOP.seminar1;

public class Rogue extends Character{
    private double criticalChance;

    public Rogue(String name) {
        super(name, 80, 5, 1);
        this.criticalChance = 0.3;
    }

    @Override
    public int attack() {
        if (Math.random() < criticalChance) {
            System.out.println(name + " бьет критический удар на " + strength*2 + "урона.");
            return strength*2;
        }
        else {
            System.out.println(name + " режет кинжалом на " + strength + "урона.");
            return strength;
        }
    }
}
