package org.example.mechanics.creator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.example.characters_and_classes.first_proffesion_player.Archer;
import org.example.characters_and_classes.first_proffesion_player.Mage;
import org.example.characters_and_classes.first_proffesion_player.Warrior;
import org.example.characters_and_classes.types_of_character.Character;

public class Creator {


    public Character randomCreate() {
        Character character = createRandomClass();
        character.setHp(generateRandomHealth());
        character.setName(pickRandomName());
        return character;
    }


    private int generateRandomHealth() {
        Random random = new Random();
        return random.nextInt(51) + 50;
    }

    public static Character createRandomClass() {
        Random random = new Random();
        int randomNum = random.nextInt(3);

        return switch (randomNum) {
            case 0 -> new Warrior();
            case 1 -> new Archer();
            case 2 -> new Mage();
            default -> null;
        };

    }


    private String pickRandomName() {
        ArrayList<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader
                ("/Users/aleksandr/IdeaProjects/OopPractice/src/main/java/org/example/data/names.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);
    }

}
