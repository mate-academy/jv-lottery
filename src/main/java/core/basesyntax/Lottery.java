package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Random random = new Random();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(101);

        Ball ball = new Ball(randomColor, randomNumber);

        return ball;
    }
}
