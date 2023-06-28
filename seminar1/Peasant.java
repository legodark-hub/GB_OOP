package GB_OOP.seminar1;

public class Peasant extends Character{
    public Peasant(String name) {
        super(name, 100, 3, 1);
    }

    @Override
    public int attack() {
        System.out.println(name + " тычет вилой на " + strength + "урона.");
        return strength;
    }
}
