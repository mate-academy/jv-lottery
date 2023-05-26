package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    private Random random = new Random();
    private ColorSupplier coloursSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newRandomBall = new Ball();
        Colors randomColor = coloursSupplier.getRandomColor();
        newRandomBall.setColor(randomColor.name());
        newRandomBall.setNumber(random.nextInt(MAX_BALL_NUMBER));
        return newRandomBall;
    }
}
