package GB_OOP.seminar1.Classes;

public class Spearman extends Infantry {
    public Spearman(String name, int x, int y) {
        super(name, 130, 5, 2, x, y);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " колет копьем на " + strength + "урона.");
        target.takeDamage(strength);

    }

}
