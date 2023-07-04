package GB_OOP.seminar1;

public class Sniper extends Character{
    private int bullets;

    public Sniper(String name, int x, int y) {
        super(name, 50, 7, 10, x, y);
        this.bullets = 5;
    }

    @Override
    public int attack() {
        if (bullets > 0) {
            System.out.println(name + " дает хеддшот на " + strength + "урона.");
            bullets--;
            return strength;
        } else {
            System.out.println(name + " без патронов.");
            return 0;
        }
    }

    public void reload(){

    };

    @Override
    public void step() {
        reload();
        attack();
    }

    @Override
    public String getInfo() {
        return String.format("%s, bullets: %d", super.getInfo(), this.bullets);
    }
}
