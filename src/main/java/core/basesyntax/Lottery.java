package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Color randomColor = color.getRandomColor();
        int randomNumber = new Random().nextInt(BALL_NUMBER);
        Ball randomBall = new Ball();
        randomBall.setBall(randomColor, randomNumber);
        return randomBall;
    }
}
