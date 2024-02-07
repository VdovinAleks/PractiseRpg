package org.example.charactersAndClasses.typesOfCharacter;

import org.example.charactersAndClasses.typesOfCharacter.Character;

public abstract class Npc extends Character {
    public Npc(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void interact(){
        System.out.println("Привет я неигровой персонаж");
    }

}
