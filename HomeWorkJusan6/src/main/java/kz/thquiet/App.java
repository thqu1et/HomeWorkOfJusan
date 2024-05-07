package kz.thquiet;

import kz.thquiet.later.Cat;
import kz.thquiet.later.Plate;

public class App {
    public static void main( String[] args ) {
        Cat[] cats = {new Cat("Tom"), new Cat("Barsik"), new Cat("Limba")};
        Plate plate = new Plate(30);
        plate.fillMax();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is hungry: " + cat.isHungry());
        }

        plate.info();
    }
}
