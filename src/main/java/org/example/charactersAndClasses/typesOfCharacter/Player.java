package org.example.charactersAndClasses.typesOfCharacter;


public abstract class Player extends Character {

    private  int lvl = 1;

    public Player(String name, int hp, int mana, int lvl) {
        super(name, hp, mana);
        this.lvl = lvl;
    }

    public Player() {
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
