package org.example;

import org.example.characters_and_classes.first_proffesion_player.*;
import org.example.characters_and_classes.types_of_character.Character;
import org.example.mechanics.creator.Creator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Character> npsList = new ArrayList<>();
        Map<Character, Boolean> log = new HashMap<>();
        Warrior war = new Warrior("Gambino", 23, 300, 23, 4, 15);

        for (int i = 0; i < 5; i++) {
            Character character = Creator.randomCharacterCreate();
            npsList.add(character);
            System.out.println(character);
        }
        npsList.stream()
                .forEachOrdered(war::fight);

//        System.out.println(npsList);
//        for (Character character : npsList) {
//            log.put(character, war.fight(character));
//        }
//        System.out.println(log);
    }

}