package GB_OOP.seminar1;

public class Spearman extends Character {
    public Spearman(String name, int x, int y) {
        super(name, 130, 5, 2, x, y);
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
