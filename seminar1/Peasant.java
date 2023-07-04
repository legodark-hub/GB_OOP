package GB_OOP.seminar1;

public class Peasant extends Character{
    public Peasant(String name, int x, int y) {
        super(name, 100, 3, 1, x, y);
    }

    @Override
    public int attack() {
        System.out.println(name + " тычет вилой на " + strength + "урона.");
        return strength;
    }

    @Override
    public void step() {
        attack();
    }
}
