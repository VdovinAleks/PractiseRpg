package org.example.characterСlass.firstProffesionPlayer;
import org.example.characterСlass.Player;

public class Mage extends Player {

    private int intelligence;
    private int magicForce;

    public Mage(String name, int lvl, int hp, int mana, int intelligence, int magicForce) {
        super(name, lvl, hp, mana);
        this.intelligence = intelligence;
        this.magicForce = magicForce;
    }

    public void fireBall (){

    }

    public void getTreatment(){

    }

    @Override
    public String toString() {
        return "Маг{" +
                "Интеллект=" + intelligence +
                ", Магическая сила=" + magicForce +
                '}';
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }
}
