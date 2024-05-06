package kz.thquiet;

public abstract class Animal {
    protected double maxRunDistance;
    protected double maxSwimDistance;
    protected double maxJumpHeight;

    public Animal(double maxRunDistance, double maxJumpHeight, double maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public boolean run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("run: true");
            return true;
        } else {
            System.out.println("run: false");
            return false;
        }
    }

    public boolean jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("jump: true");
            return true;
        } else {
            System.out.println("jump: false");
            return false;
        }
    }

    public boolean swim(double distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("swim: true");
            return true;
        } else {
            System.out.println("swim: false");
            return false;
        }
    }
}
