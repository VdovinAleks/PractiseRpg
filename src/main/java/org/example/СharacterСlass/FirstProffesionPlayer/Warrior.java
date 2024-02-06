package org.example.СharacterСlass.FirstProffesionPlayer;

import org.example.СharacterСlass.Player;

public class Warrior extends Player {
    private int strength;
    private int endurance;

    public Warrior(String name, int lvl, int hp, int mana, int strength, int endurance) {
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

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }
}
