package core.basesyntax;

public class Application {
    private static final int MAGIC_THREE = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAGIC_THREE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
