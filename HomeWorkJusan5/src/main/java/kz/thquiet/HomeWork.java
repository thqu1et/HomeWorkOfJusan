package kz.thquiet;

public class HomeWork {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Dog dog = new Dog(500, 0.5, 10);
        Cat cat = new Cat(200, 2);

        dog.run(450);
        dog.jump(0.3);
        dog.swim(5);

        cat.run(100);
        cat.jump(1.5);
        System.out.println("Cat:"+cat.swim(1));


        Dog dog1 = new Dog(400, 0.5, 8);
        Dog dog2 = new Dog(600, 0.6, 12);
    }
}
