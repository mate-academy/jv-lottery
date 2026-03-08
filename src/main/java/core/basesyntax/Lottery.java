package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int MAX_BALL_BOUND = 101;
        int randomNumber = new Random().nextInt(MAX_BALL_BOUND);
        return new Ball(color, randomNumber);
    }
}
