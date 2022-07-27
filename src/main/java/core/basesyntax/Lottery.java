package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall() {
        String ballColor = getRandomColor();
        int ballNamber = new Random().nextInt(MAX_NUMBER) + 1;
        return new Ball(Integer.toString(ballNamber), ballColor);
    }
}
