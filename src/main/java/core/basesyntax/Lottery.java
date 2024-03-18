package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(MAX_BALL_NUMBER);

        return new Ball(color, randomNumber);
    }
}
