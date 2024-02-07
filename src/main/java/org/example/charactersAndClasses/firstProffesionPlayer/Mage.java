package org.example.charactersAndClasses.firstProffesionPlayer;

import org.example.charactersAndClasses.typesOfCharacter.Player;
import org.example.mechanics.characterInterface.Fightable;
import org.example.mechanics.characterInterface.Playable;

public class Mage extends Player implements Playable, Fightable {

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
        return "Маг{" +
                "Интеллект=" + intelligence +
                ", Магическая сила=" + magicForce +
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
