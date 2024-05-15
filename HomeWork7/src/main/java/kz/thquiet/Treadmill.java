package kz.thquiet;

public class Treadmill extends Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean pass(Movable competitor) {
        competitor.run();
        return true;
    }
}
