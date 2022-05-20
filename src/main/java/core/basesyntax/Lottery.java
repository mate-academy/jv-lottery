package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();
    private final int numbersLimit = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColors(randomColor.getRandomColor());
        ball.setNumbers(random.nextInt(numbersLimit));
        return ball;
    }
}
