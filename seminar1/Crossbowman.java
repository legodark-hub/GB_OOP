package GB_OOP.seminar1;

public class Crossbowman extends Character{
    private int bolts;

    public Crossbowman(String name, int x, int y) {
        super(name, 60, 6, 6, x, y);
        this.bolts = 20;
    }

    @Override
    public void attack(Character target) {
        if (bolts > 0) {
            System.out.println(name + " стреляет с арбалета на " + strength + "урона.");
            bolts--;
            target.takeDamage(strength);
        } else {
            System.out.println(name + " без болтов для арбалета.");
        }
    }

    public void reload() {
    }

    @Override
    public void step() {
        reload();
        attack();
    }

    @Override
    public String getInfo() {
        return String.format("%s, bolts: %d", super.getInfo(), this.bolts);
    }
}
