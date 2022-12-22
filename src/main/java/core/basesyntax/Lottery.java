package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int NUMBERS_LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int numbersLimit = random.nextInt(NUMBERS_LIMIT);
        Color randomColor = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(numbersLimit);
        return ball;
    }
}
