package org.example.mechanics.creator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.example.characters_and_classes.types_of_character.Character;

public class Creator {


    private Character randomCreate() {
        return null;
    }


    private int generateRandomHealth() {
        Random random = new Random();
        return random.nextInt(51) + 50;
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
