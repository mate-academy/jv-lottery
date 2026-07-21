package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random();
    public Ball getRandomBall() {
        int randomNumber = random.nextInt(MAX_BALL_NUMBER); // максимум 100
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
