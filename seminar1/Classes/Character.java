package GB_OOP.seminar1.Classes;

import java.util.List;

public abstract class Character implements CharacterInterface {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int strength;
    protected int attackRange;
    protected Coordinates coordinates;

    public Character(String name, int health, int strength, int attackRange, int x, int y) {
        this.name = name;
        this.maxHealth = health;
        this.health = this.maxHealth;
        this.strength = strength;
        this.attackRange = attackRange;
        this.coordinates = new Coordinates(x, y);
    }

    public int[] getCoords() {
        int[] coords = { coordinates.getX(), coordinates.getY() };
        return coords;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attack(Character target);

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " повержен!");
        } else {
            System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
        }
    }

    public String getInfo() {
        return String.format("%s, HP:%d STR:%d AR:%d x:%d y:%d",
                this.name, this.health, this.strength, this.attackRange,
                this.coordinates.getX(), this.coordinates.getY());
    }

    public double calculateDistance(Character character) {
        int xDiff = coordinates.getX() - character.coordinates.getX();
        int yDiff = coordinates.getY() - character.coordinates.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public Character findNearestEnemy(List<Character> enemies) {
        Character nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Character enemy : enemies) {
            double distance = calculateDistance(enemy);
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        if (nearestEnemy != null) {
            System.out
                    .println("Ближайший к " + name + " враг - " + nearestEnemy.name + ". Расстояние - " + minDistance);
        } else {
            System.out.println(name + " не наблюдает рядом врагов");
        }
        return nearestEnemy;
    }
}
