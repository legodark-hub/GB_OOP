package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public abstract class Infantry extends Character {

    public Infantry(String name, int health, int strength, int attackRange, int x, int y) {
        super(name, health, strength, attackRange, x, y);
    }
    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        if (health <= 0) {
            return;
        }

        Character nearestEnemy = findNearestEnemy(enemies);

        if (nearestEnemy != null) {
            int targetX = nearestEnemy.coordinates.getX();
            int targetY = nearestEnemy.coordinates.getY();

            int diffX = targetX - coordinates.getX();
            int diffY = targetY - coordinates.getY();

            int newX = coordinates.getX();
            int newY = coordinates.getY();

            if (Math.abs(diffX) > Math.abs(diffY)) {
                newX = coordinates.getX() + Integer.compare(diffX, 0);
            } else {
                newY = coordinates.getY() + Integer.compare(diffY, 0);
            }

            
            for (Character character : allies) {
                if (character != this && character.health > 0 &&
                        character.coordinates.getX() == newX && character.coordinates.getY() == newY) {
                    return;  
                }
            }

            coordinates = new Coordinates(newX, newY);
        }

        if (nearestEnemy != null && calculateDistance(nearestEnemy) <= attackRange) {
            attack(nearestEnemy);
        }
    }

}
