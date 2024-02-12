package org.example.characters_and_classes.first_proffesion_player;

import org.example.characters_and_classes.types_of_character.Player;

public class Archer extends Player {
    private int agility = 2;
    private int accuracy = 6;

    public void setFirstStat(int agility) {
        this.agility = agility;
    }

    public void setSecondStat(int accuracy) {
        this.accuracy = accuracy;
    }

    public Archer(String name, int lvl, int hp, int mana, int agility, int accuracy) {
        super(name, hp, mana, lvl);
        this.agility = agility;
        this.accuracy = accuracy;
    }

    public Archer() {
    }

    @Override
    public String toString() {
        return "\nЛучник -> " + super.toString() +
                "\nЛовкость -> " + agility +
                "\nТочность -> " + accuracy ;
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
