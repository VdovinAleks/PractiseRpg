package org.example.characterСlass.firstProffesionPlayer;

import org.example.characterСlass.Player;
import org.example.characterСlass.characterInterface.Fightable;
import org.example.characterСlass.characterInterface.Playable;

public class Warrior extends Player implements Playable, Fightable {
    private int strength = 10;
    private int endurance = 10;

    public Warrior(String name, int hp, int mana, int strength, int endurance) {
        super(name, hp, mana);
        this.strength = strength;
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Воин{" + super.toString() +
                "Сила=" + strength +
                ", Выносливость=" + endurance +
                '}';
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }


    @Override
    public void fight() {

    }
}
