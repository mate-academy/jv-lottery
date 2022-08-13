package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier coloursSupplier = new ColorSupplier();
        Colors randomColor = coloursSupplier.getRandomColor();
        randomBall.setColor(randomColor.name());
        Random random = new Random();
        randomBall.setNumber(random.nextInt(BALL_NUMBER));
        return randomBall;
    }
}
