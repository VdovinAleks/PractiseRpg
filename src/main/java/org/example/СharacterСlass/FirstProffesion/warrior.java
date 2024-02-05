package org.example.СharacterСlass.FirstProffesion;

import org.example.СharacterСlass.character;

public class warrior extends character {
    private int strength;
    private int endurance;

    public warrior(String name, int lvl, int hp, int mana, int strength, int endurance) {
        super(name, lvl, hp, mana);
        this.strength = strength;
        this.endurance = endurance;
    }

    private void swordHit(){

    }
    private void block(){

    }

    @Override
    public String toString() {
        return "Воин{" + super.toString() +
                "Сила=" + strength +
                ", Выносливость=" + endurance +
                '}';
    }
}
