package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_MAX_NUMBER = 100;

    public Ball getRandomBall() {
        int randomNumber = new Random().nextInt(BALL_MAX_NUMBER);
        Color randomColor = new ColorSupplier().getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}
