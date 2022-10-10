package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;
    private final Color randomColor = new ColorSupplier().getRandomColor();
    private final int randomNumber = new Random().nextInt(BALL_NUMBER);

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setBall(randomColor, randomNumber);
        return randomBall;
    }
}
