package org.example.characterСlass;


import org.example.characterСlass.characterInterface.Playable;

public abstract class Player extends Character {

    private  int lvl;

    public Player(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public Player levelUp() {
        if (this.lvl < 80) {
            this.lvl += 1;
            System.out.println("Вы повысили свой уровень!\nВаш уровень-> "+this.lvl);
        } else System.out.println("Вы достигли максимального уровня!");
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
