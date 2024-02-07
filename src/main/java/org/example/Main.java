package org.example;

import org.example.charactersAndClasses.firstProffesionPlayer.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long duration = 15 * 1000; // 15 секунд в миллисекундах
        List<Character> npsList = new ArrayList<>();
        Warrior war = new Warrior("Gambino", 23,50,23,34, 32);
        Warrior war1 = new Warrior();
        System.out.println(war);
        System.out.println(war1);
//        while (System.currentTimeMillis() - startTime < duration) {
//
//
//        }
    }
}