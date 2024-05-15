package kz.thquiet;

public class Robot implements Movable{
    @Override
    public void run() {
        System.out.println("Robot is running");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping");
    }
}
