package core.basesyntax;

public class Application {
    private static final int LOOP_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.println(lottery.getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
