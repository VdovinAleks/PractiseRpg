package org.example.characterСlass.firstProffesionPlayer;

import org.example.characterСlass.Player;
import org.example.characterСlass.characterInterface.Fightable;
import org.example.characterСlass.characterInterface.Playable;

public class Archer extends Player implements Playable, Fightable {
    private int agility = 10;
    private int accuracy = 10;

    public Archer(String name, int hp, int mana, int agility, int accuracy) {
        super(name, hp, mana);
        this.agility = agility;
        this.accuracy = accuracy;
    }

    private void useArrow() {

    }

    private void useSecrecy() {

    }

    @Override
    public String toString() {
        return "Лучник{" + super.toString() +
                "Ловкость=" + agility +
                ", Точность=" + accuracy +
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
