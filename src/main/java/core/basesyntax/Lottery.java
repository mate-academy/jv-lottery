package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;

    public static Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(MAX_BALL_NUMBER);
        return new Ball(number, ColorSupplier.getRandomColor());
    }
}
