package org.example.charactersAndClasses.firstProffesionPlayer;

import org.example.charactersAndClasses.typesOfCharacter.Player;
import org.example.mechanics.characterInterface.Fightable;
import org.example.mechanics.characterInterface.Playable;

public class Warrior extends Player implements Playable, Fightable {
    private int strength = 2;
    private int endurance = 4;

    public Warrior(String name, int lvl, int hp, int mana, int strength, int endurance) {
        super(name, hp, mana, lvl);
        this.strength = strength;
        this.endurance = endurance;
    }

    public Warrior() {
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
        return getBaseDamage() * strength;
    }

    @Override
    public int defend() {
        return 0;
    }


    @Override
    public void fight() {

    }
}
