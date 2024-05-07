package kz.thquiet.later;

public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0; // Начальное количество еды
    }

    public void fillMax() {
        food = capacity;
    }

    public void addFood(int amount) {
        if (amount + food <= capacity) {
            food += amount;
        } else {
            food = capacity; // Заполняем до максимума, если пытаемся добавить больше
        }
    }

    public void info() {
        System.out.printf("Plate: %d / %d\n", food, capacity);
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public int getFood() {
        return food;
    }
}
