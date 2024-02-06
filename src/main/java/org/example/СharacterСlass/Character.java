package org.example.СharacterСlass;
import org.example.СharacterСlass.СharacterInterface.Npc;

public abstract class Character implements Npc {
    private final String name;
    private int hp;
    private int mana;

    @Override
    public abstract void interact();

    public Character(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "nps{" +
                "Имя='" + name + '\'' +
                ", Здоровье=" + hp +
                ", Мана=" + mana +
                '}';
    }
}
