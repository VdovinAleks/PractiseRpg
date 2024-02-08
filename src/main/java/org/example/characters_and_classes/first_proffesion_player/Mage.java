package org.example.characters_and_classes.first_proffesion_player;

import org.example.characters_and_classes.types_of_character.Player;

public class Mage extends Player {

    private int intelligence = 10;
    private int magicForce = 10;

    public Mage(String name, int lvl, int hp, int mana, int intelligence, int magicForce) {
        super(name, hp, mana, lvl);
        this.intelligence = intelligence;
        this.magicForce = magicForce;
    }

    public Mage() {
    }

    public void fireBall() {

    }

    public void getTreatment() {

    }

    @Override
    public String toString() {
        return "\nМаг-> " + super.toString() +
                "\nИнтеллект-> " + intelligence +
                "\nМагическая сила-> " + magicForce;
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
