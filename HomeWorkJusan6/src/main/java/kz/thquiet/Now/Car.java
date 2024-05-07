package kz.thquiet.Now;

public class Car {
    private IEngine engine;

    private Car(IEngine engine) {
        this.engine = engine;
    }

    public void move() {
        Car car = new Car(new Engine());
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}
