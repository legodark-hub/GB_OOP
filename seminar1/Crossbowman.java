package GB_OOP.seminar1;

public class Crossbowman extends Character{
    private int bolts;

    public Crossbowman(String name, int x, int y) {
        super(name, 60, 6, 6, x, y);
        this.bolts = 20;
    }

    @Override
    public int attack() {
        if (bolts > 0) {
            System.out.println(name + " стреляет с арбалета на " + strength + "урона.");
            bolts--;
            return strength;
        } else {
            System.out.println(name + " без болтов для арбалета.");
            return 0;
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
