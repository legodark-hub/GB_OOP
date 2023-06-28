package GB_OOP.seminar1;

public class Warlock extends Character{
    private int mana;

    public Warlock(String name) {
        super(name, 40, 7, 5);
        this.mana = 100;
    }

    @Override
    public int attack() {
        if (mana >= 10) {
            System.out.println(name + " кастует фаербол на " + strength + "урона.");
            mana -= 10;
            return strength;
        } else {
            System.out.println(name + " без маны");
            return 0;
        }
    }

    public void regenerateMana() {
        mana += 20;
        System.out.println(name + " восстанавливает 20 маны.");
    }
}
