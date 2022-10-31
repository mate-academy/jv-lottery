package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int BALL_MAX_NUMBER = 100;
    private Random random = new Random();

    public Ball getRandomBall() {
        Color randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(BALL_MAX_NUMBER);
        return new Ball(randomColor, randomNumber);
    }
}
