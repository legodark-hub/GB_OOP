package GB_OOP.seminar1;

public class Rogue extends Character{
    private double criticalChance;

    public Rogue(String name, int x, int y) {
        super(name, 80, 5, 1, x, y);
        this.criticalChance = 0.3;
    }

    @Override
    public void attack(Character target) {
        if (Math.random() < criticalChance) {
            System.out.println(name + " бьет критический удар на " + strength*2 + "урона.");
            target.takeDamage(strength*2);
        }
        else {
            System.out.println(name + " режет кинжалом на " + strength + "урона.");
            target.takeDamage(strength);
        }
    }

    @Override
    public void step() {
        attack();
    }
}
