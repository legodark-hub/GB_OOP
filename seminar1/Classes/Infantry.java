package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public abstract class Infantry extends Character {

    public Infantry(String name, int health, int strength, int attackRange, int x, int y) {
        super(name, health, strength, attackRange, x, y);
    }
    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        if (isDead()) {
            return;
        }

        Character nearestEnemy = findNearestEnemy(enemies);

        if (nearestEnemy == null) return;

        if (calculateDistance(nearestEnemy) > attackRange) {
            movement(nearestEnemy, allies);
        }

        if (calculateDistance(nearestEnemy) <= attackRange) {
            attack(nearestEnemy);
        }


        return;
    }

}
