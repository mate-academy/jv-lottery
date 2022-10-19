package core.basesyntax;

public class Application {
    private static final int numberOfBalls = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballExample = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            String ball = ballExample.getRandomBall().toString();
            System.out.println((i + 1) + " " + ball);
        }
    }
}
