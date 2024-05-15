package kz.thquiet;


public class App {
    public static void main( String[] args ) {
        Movable[] participants = {new Human(), new Cat(), new Robot()};
        Obstacle[] obstacles = {new Treadmill(100), new Wall(2)};

        for (Movable participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.pass(participant)) {
                    System.out.println("Couldn't get through");
                    break;
                }
            }
        }
    }
}
