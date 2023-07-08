package GB_OOP.seminar1.Classes;

public class Peasant extends Character{
    public Peasant(String name, int x, int y) {
        super(name, 100, 3, 1, x, y);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " тычет вилой на " + strength + "урона.");
        target.takeDamage(strength);
    }

    @Override
    public void step() {
        attack();
    }
}
