package GB_OOP.seminar1;

public class Monk extends Character{
    public Monk(String name) {
        super(name, 120, 10, 1);
    }

    @Override
    public int attack() {
        System.out.println(name + " дает мощный пендель на" + strength + "урона.");
        return strength;
    }

    @Override
    public void step() {
        attack();
    }
}
