package kz.thquiet;

public class Human implements Movable{
    @Override
    public void run() {
        System.out.println("Human running");
    }

    @Override
    public void jump() {
        System.out.println("Human jumped");
    }
}
