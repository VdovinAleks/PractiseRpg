package org.example.characters_and_classes.types_of_character;

public abstract class Npc extends Character {
    public Npc(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void interact() {
        System.out.println("Привет я неигровой персонаж");
    }

}
