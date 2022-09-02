package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String randomColor = colorSupplier.getRandomColor().name();
        int randomNumber = random.nextInt(100);
        ball.setColor(randomColor);
        ball.setNumber(randomNumber);
        return ball;
    }
}
