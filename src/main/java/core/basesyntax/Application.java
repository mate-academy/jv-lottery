package core.basesyntax;

public class Application extends Lottery {
    private static final int NUMBER_OF_BALLS = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

