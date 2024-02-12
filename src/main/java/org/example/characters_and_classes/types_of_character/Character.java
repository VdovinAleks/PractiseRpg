package org.example.characters_and_classes.types_of_character;

import org.example.mechanics.character_interface.Fightable;
import org.example.mechanics.character_interface.Playable;

public abstract class Character implements Fightable, Playable {
    private final int baseDamage = 4;
    private String name = "Character";
    private int hp = 50;
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

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public Boolean fight(Character character) {
        while (this.hp > 0 && character.hp > 0) {
            character.hp -= attack();
            System.out.println(character.name + " Атаковал " + this.name + " на " + character.attack() + " урона");
            if (this.hp < 1){
                break;
            }
            this.hp -= attack();
            System.out.println(this.name + " Атаковал " + character.name + " на " + this.attack() + " урона");
        }
        System.out.println("Итоги боя:\n" + this.name + " -> " + this.hp + "\n" + character.name + " -> " + character.hp);
        return this.hp > 0;
    }

    @Override
    public int attack() {
        return this.baseDamage;
    }

    public abstract void setFirstStat(int i);
    public abstract void setSecondStat(int i);
}
