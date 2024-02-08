package org.example.charactersAndClasses.firstProffesionPlayer;

import org.example.charactersAndClasses.typesOfCharacter.Player;
import org.example.mechanics.characterInterface.Fightable;
import org.example.mechanics.characterInterface.Playable;

public class Archer extends Player {
    private int agility = 10;
    private int accuracy = 10;

    public Archer(String name, int lvl, int hp, int mana, int agility, int accuracy) {
        super(name, hp, mana, lvl);
        this.agility = agility;
        this.accuracy = accuracy;
    }

    public Archer() {
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
