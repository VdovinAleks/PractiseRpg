package org.example.charactersAndClasses.typesOfCharacter;

import org.example.mechanics.characterInterface.Fightable;

public abstract class Character implements Fightable {
    private final int baseDamage = 10;
    private  String name = "Character";
    private int hp = 100;
    private int mana = 50;

    public Character(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    public Character() {

    }

    @Override
    public String toString() {
        return "nps{" +
                "Имя='" + name + '\'' +
                ", Здоровье=" + hp +
                ", Мана=" + mana +
                '}';
    }

    public void fight(Character character) {
        while (this.hp < 1|| character.hp < 1){

        }

    }
}
