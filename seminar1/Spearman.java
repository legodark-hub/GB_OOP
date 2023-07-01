package GB_OOP.seminar1;

public class Spearman extends Character {
    public Spearman(String name) {
        super(name, 130, 5, 2);
    }

    @Override
    public int attack() {
        System.out.println(name + " колет копьем на " + strength + "урона.");
        return strength;

    }

    @Override
    public void step() {
        attack();
    }
}
