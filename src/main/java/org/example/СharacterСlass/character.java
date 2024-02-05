package org.example.СharacterСlass;


import org.example.СharacterСlass.FirstProffesion.archer;

public abstract class character {
    private final String name;
    private int lvl;
    private int hp;
    private int mana;

    public void attack(character character) {
        int damage = character.hp - this.lvl * 3;
        System.out.println(this.name + " атакует " + character.name + " и наносит " + damage + " Урона");
        character.hp -= damage;
        System.out.println(character);
    }

    public void useSpell() { //Должен принимать метод(заклинание)

    }

    public void heal() {
        this.mana -= 5;
        this.hp += (2 * lvl);
        System.out.println(this.name + " Излечивает себя " + this.hp + " " + this.mana);
    }

    public character(String name, int lvl, int hp, int mana) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Персонаж{" +
                "Имя='" + name + '\'' +
                ", Уровень=" + lvl +
                ", Здоровье=" + hp +
                ", Мана=" + mana +
                '}';
    }
}
