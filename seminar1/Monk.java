package GB_OOP.seminar1;

public class Monk extends Character{
    public Monk(String name, int x, int y) {
        super(name, 120, 10, 1, x, y);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " дает мощный пендель на" + strength + "урона.");
        target.takeDamage(strength);
    }

    @Override
    public void step() {
        attack();
    }
}
