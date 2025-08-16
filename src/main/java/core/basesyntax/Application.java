package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        final int ballCount = 3;
        for (int i = 0; i < ballCount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
