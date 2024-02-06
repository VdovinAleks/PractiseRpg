package org.example.СharacterСlass;


import org.example.СharacterСlass.СharacterInterface.Playable;

public abstract class Player implements Playable {
    private final String name;
    private int lvl;
    private int hp;
    private int mana;

    public void attack(Player character) {
        int damage = character.hp - this.lvl * 3;
        System.out.println(this.name + " атакует " + character.name + " и наносит " + damage + " Урона");
        character.hp -= damage;
        System.out.println(character);
    }

    @Override
    public void levelUp() {
        if (this.lvl < 80) {
            this.lvl += 1;
            System.out.println("Вы повысили свой уровень!\nВаш уровень-> "+this.lvl);
        } else System.out.println("Вы достигли максимального уровня!");
    }

    public Player(String name, int lvl, int hp, int mana) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Игрок{" +
                "Имя='" + name + '\'' +
                ", Уровень=" + lvl +
                ", Здоровье=" + hp +
                ", Мана=" + mana +
                '}';
    }
}
