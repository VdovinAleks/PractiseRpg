package org.example.charactersAndClasses.typesOfCharacter;

import org.example.mechanics.characterInterface.Fightable;
import org.example.mechanics.characterInterface.Playable;

public abstract class Character implements Fightable,Playable {
    private final int baseDamage = 4;
    private String name = "Character";
    private int hp = 100;
    private int mana = 50;

    public Character(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Character() {

    }

    @Override
    public String toString() {
        return "Персонаж{" +
                "Имя='" + name + '\'' +
                ", Здоровье=" + hp +
                ", Мана=" + mana +
                '}';
    }

    public void fight(Character character) {
        while (this.hp < 1 || character.hp < 1) {
            character.hp -= this.baseDamage;
            System.out.println(character.name + "Атаковал " + this.name + " на" + character.baseDamage + "урона");
            this.hp -= character.baseDamage;
            System.out.println(this.name + "Атаковал " + character.name + " на" + this.baseDamage + "урона");
        }
        System.out.println(character + "\n" + this);
    }

    @Override
    public int attack() {
        return this.baseDamage;
    }

}
