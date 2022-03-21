package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int LIMIT = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        Ball randomBall = new Ball();
        randomBall.setColor(randomColor);
        randomBall.setNumber(random.nextInt(LIMIT));
        return randomBall;
    }
}
