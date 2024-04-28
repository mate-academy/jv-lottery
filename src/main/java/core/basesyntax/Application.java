package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int LOOP_COUNT = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
