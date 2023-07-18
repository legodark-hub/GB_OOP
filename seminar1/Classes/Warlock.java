package GB_OOP.seminar1.Classes;

import java.util.ArrayList;

public class Warlock extends Character {
    private int mana;

    public Warlock(String name, int x, int y) {
        super(name, 40, 7, 99, x, y);
        this.mana = 100;
    }

    @Override
    public void attack(Character target) {
        if (mana >= 10) {
            System.out.println(name + " кастует фаербол на " + strength + "урона.");
            mana -= 10;
            target.takeDamage(strength);
        } else {
            System.out.println(name + " без маны");
        }
    }

    public void regenerateMana() {
        mana += 20;
        System.out.println(name + " восстанавливает 20 маны.");
    }

    public void healAlly(ArrayList<Character> allies) {
        for (Character ally:allies) {
            if (ally.health<ally.maxHealth) {
                ally.health+=10;
                System.out.println(name + " отхиливает " + ally.name + "на 10 хп");
            }
        }
    }

    @Override
    public void step(ArrayList<Character> enemies, ArrayList<Character> allies) {
        healAlly(allies);
        attack(findNearestEnemy(enemies));
    }

    @Override
    public String getInfo() {
        return String.format("%s MP: %d", super.getInfo(), this.mana);
    }
}
