package org.example;

import org.example.СharacterСlass.Character;
import org.example.СharacterСlass.FirstProffesionPlayer.*;

public class Main {
    public static void main(String[] args) {
        Archer luk = new Archer("Хавк",25,100,50,40,12);
        System.out.println(luk);
        Character a = new Character("123", 1,2) {
            @Override
            public void interact() {

            }
        };




    }
}