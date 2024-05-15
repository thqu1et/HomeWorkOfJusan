package kz.thquiet;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean pass(Movable competitor) {
        competitor.jump();
        return true;
    }
}
