package org.example.characters_and_classes.first_proffesion_player;

import org.example.characters_and_classes.types_of_character.Player;

public class Warrior extends Player {
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
        return "\nВоин -> " + super.toString() +
                "\nСила-> " + strength +
                "\nВыносливость-> " + endurance;
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
