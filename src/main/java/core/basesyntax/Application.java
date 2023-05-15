package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int numberOfBalls = 3;
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(Lottery.getRandomBall());
        }
    }

}
