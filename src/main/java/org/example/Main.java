package org.example;

import org.example.СharacterСlass.FirstProffesion.*;

public class Main {
    public static void main(String[] args) {
        archer luk = new archer("Хавк",25,100,50,40,12);
        System.out.println(luk);
        luk.heal();
        System.out.println(luk);
        warrior war = new warrior("Гатс",23,150,25,35,32);
        System.out.println(war);
        luk.attack(war);

    }
}