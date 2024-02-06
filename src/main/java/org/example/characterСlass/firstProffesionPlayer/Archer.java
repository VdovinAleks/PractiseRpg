package org.example.characterСlass.firstProffesionPlayer;
import org.example.characterСlass.Player;

public class Archer extends Player {
    private int agility;
    private int accuracy;

    public Archer(String name, int lvl, int hp, int mana, int agility, int accuracy) {
        super(name, lvl, hp, mana);
        this.agility = agility;
        this.accuracy = accuracy;
    }

    private void useArrow(){

    }
    private void useSecrecy(){

    }

    @Override
    public String toString() {
        return "Лучник{" + super.toString() +
                "Ловкость=" + agility +
                ", Точность=" + accuracy +
                '}';
    }

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }
}
