package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public class Crossbowman extends Character {
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

    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        if (health <= 0 || bolts == 0)
            return;
        attack(findNearestEnemy(enemies));
        if (hasPeasant(allies)) {
            bolts++;
            return;
        }
        return;
    }

    @Override
    public String getInfo() {
        return String.format("%s, bolts: %d", super.getInfo(), this.bolts);
    }

    public boolean hasPeasant(ArrayList<Character> team) {
        for (Character ally : team) {
            if (ally instanceof Peasant) {
                return true;
            }
        }
        return false;
    }
}
