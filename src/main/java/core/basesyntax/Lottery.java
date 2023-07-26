package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        int indexNumber = random.nextInt(MAX_BALL_NUMBER);
        ColorsEnum color = getRandomColor();
        return new Ball(color, indexNumber);
    }
}
