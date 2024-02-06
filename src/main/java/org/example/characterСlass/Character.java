package org.example.characterСlass;
import org.example.characterСlass.characterInterface.Npc;

public abstract class Character implements Npc {
    private final String name;
    private int hp;
    private int mana;

    @Override
    public void interact(){
        System.out.println("Привет я " + this.name);
    };

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
