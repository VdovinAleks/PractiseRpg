package org.example;

import org.example.charactersAndClasses.firstProffesionPlayer.*;
import org.example.charactersAndClasses.typesOfCharacter.Npc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long duration = 5 * 1000; // 15 секунд в миллисекундах
        List<Character> npsList = new ArrayList<>();
        Warrior war = new Warrior("Gambino", 23, 300, 23, 4, 15);
        while (System.currentTimeMillis() - startTime < duration) {
            Map<Npc,Boolean>
            Warrior warrior = new Warrior();
            war.fight(warrior);
            if (war.getHp() < 1) break;
        }
    }
}