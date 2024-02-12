package core.basesyntax;

public class Application {
    public static final int SUPPLY = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < SUPPLY; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
