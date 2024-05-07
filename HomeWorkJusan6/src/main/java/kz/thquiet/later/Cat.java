package kz.thquiet.later;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name) {
        this.name = name;
        this.appetite = 15;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            hungry = false;
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }
}