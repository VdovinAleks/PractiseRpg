package org.example.characterСlass.firstProffesionPlayer;
import org.example.characterСlass.Player;
import org.example.characterСlass.characterInterface.Fightable;
import org.example.characterСlass.characterInterface.Playable;

public class Mage extends Player implements Playable, Fightable {

    private int intelligence = 10;
    private int magicForce = 10;

    public Mage(String name, int hp, int mana, int intelligence, int magicForce) {
        super(name, hp, mana);
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
