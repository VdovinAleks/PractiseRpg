package org.example.mechanics.creator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import org.example.characters_and_classes.first_proffesion_player.Archer;
import org.example.characters_and_classes.first_proffesion_player.Mage;
import org.example.characters_and_classes.first_proffesion_player.Warrior;
import org.example.characters_and_classes.types_of_character.Character;

public class Creator {


    public static Character randomCharacterCreate() {
        Character character = createRandomClass();
        character.setHp(generateRandomHealth());
        character.setName(getRandomNameFromFile());
        character.setFirstStat(generateRandomFirstStat());
        character.setSecondStat(generateRandomSecondStat());
        return character;
    }


    private static int generateRandomHealth() {
        Random random = new Random();
        return random.nextInt(51) + 50;
    }
    private static int generateRandomFirstStat() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
    private static int generateRandomSecondStat() {
        Random random = new Random();
        return random.nextInt(3) + 1;
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
    public static String getRandomNameFromFile() {
        List<String> names;
        try {
            names = Files.readAllLines(Paths.get("src/main/java/org/example/data/names.txt"));
        } catch (IOException e) {
            return null;
        }

        if (names.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);
    }


}
