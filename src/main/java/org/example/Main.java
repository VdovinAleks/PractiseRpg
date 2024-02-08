package org.example;

import org.example.characters_and_classes.first_proffesion_player.*;
import org.example.characters_and_classes.types_of_character.Character;
import org.example.characters_and_classes.types_of_character.Npc;
import org.example.mechanics.creator.Creator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long duration = 5 * 1000; // 15 секунд в миллисекундах
        List<Character> npsList = new ArrayList<>();
        Warrior war = new Warrior("Gambino", 23, 300, 23, 4, 15);
        Creator creator = new Creator();
        for (int i = 0; i < 5; i++) {
            Character character = creator.randomCreate();
            npsList.add(character);
        }
        System.out.println(npsList);
//        while (System.currentTimeMillis() - startTime < duration) {
//            Map<Npc,Boolean>
//            Warrior warrior = new Warrior();
//            war.fight(warrior);
//            if (war.getHp() < 1) break;
//        }
    }

}