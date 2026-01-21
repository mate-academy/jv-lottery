package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(MAX_BALL_NUMBER) + 1; // 1 do 100
    }
}
