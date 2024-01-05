package core.basesyntax;

public class Application {
    private static final int BOUND = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < BOUND; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
