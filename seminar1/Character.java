package GB_OOP.seminar1;

public abstract class Character implements CharacterInterface{
    protected String name;
    protected int health;
    protected int strength;
    protected int attackRange;

    public Character(String name, int health, int strength, int attackRange) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attackRange = attackRange;
    }

    public abstract int attack();

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " повержен!");
        } else {
            System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
        }
    }

    public String getInfo() {
        return String.format("Name: %s, class: %s, HP: %d  strength: %s, attack range: %d" , 
                this.name,  this.getClass().getSimpleName(), this.health, this.strength, this.attackRange);
    }
}
