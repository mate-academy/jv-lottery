package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball1 = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(ball1.getRandomBall());
        }

    }
}
