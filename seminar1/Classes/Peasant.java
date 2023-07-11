package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public class Peasant extends Character{
    private boolean busy;

    public Peasant(String name, int x, int y) {
        super(name, 100, 3, 1, x, y);
        this.busy = false;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " тычет вилой на " + strength + "урона.");
        target.takeDamage(strength);
    }

    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        busy = false;
        //attack();
    }
}
