package org.example.СharacterСlass.FirstProffesion;
import org.example.СharacterСlass.character;

public class mage extends character {

    private int intelligence;
    private int magicForce;

    public mage(String name, int lvl, int hp, int mana, int intelligence, int magicForce) {
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
}
