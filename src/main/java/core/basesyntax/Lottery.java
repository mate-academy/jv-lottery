package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = (random.nextInt(100));
        String randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball(randomColor, randomNumber);
        return ball;
    }
}
