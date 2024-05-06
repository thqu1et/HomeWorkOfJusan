package kz.thquiet;

public class Cat extends Animal{

    public Cat(double maxRunDistance, double maxJumpHeight) {
        super(maxRunDistance, maxJumpHeight, 0); // Коты не умеют плавать.
    }

    @Override
    public boolean swim(double distance) {
        System.out.println("swim: false, cats cannot swim");
        return false;
    }
}
