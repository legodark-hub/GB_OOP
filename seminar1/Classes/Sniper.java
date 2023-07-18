package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public class Sniper extends Character{
    private int bullets;

    public Sniper(String name, int x, int y) {
        super(name, 50, 7, 10, x, y);
        this.bullets = 5;
    }

    @Override
    public void attack(Character target) {
        if (bullets > 0) {
            System.out.println(name + " дает хеддшот на " + strength + "урона.");
            bullets--;
            target.takeDamage(strength);
        } else {
            System.out.println(name + " без патронов.");
        }
    }

    public void reload(){
        bullets+=5;
    };

    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        if (isDead()) return;
        if (bullets>0) {
            Character nearestEnemy = findNearestEnemy(enemies);

        if (nearestEnemy == null) return;

        if (calculateDistance(nearestEnemy) > attackRange) {
            movement(nearestEnemy, allies);
        }

        if (calculateDistance(nearestEnemy) <= attackRange) {
            attack(nearestEnemy);
        }
        }
        else reload();
        return;
    }

    @Override
    public String getInfo() {
        return String.format("%s B: %d", super.getInfo(), this.bullets);
    }
}
