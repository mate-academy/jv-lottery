package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int NUMBER_OF_ITERATION = 3;
    public static final int MAX_NUMBER_OF_BALL = 100;
    private static final Random random = new Random();

    public static Random getRandom() {
        return random;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
            System.out.println(lottery.getRandomBall().getToString());
        }
    }
}


