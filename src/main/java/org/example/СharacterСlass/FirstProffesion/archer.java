package org.example.СharacterСlass.FirstProffesion;
import org.example.СharacterСlass.character;

public class archer extends character {
    private int agility;
    private int accuracy;

    public archer(String name, int lvl, int hp, int mana, int agility, int accuracy) {
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
}
