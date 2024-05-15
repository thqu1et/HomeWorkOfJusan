package kz.thquiet;

public class Cat implements Movable{

    @Override
    public void run() {
        System.out.println("Cat runned");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumped");
    }

}
