package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER = 100;

    public Ball getRandomBall() {
        Ball newRandomBall = new Ball();
        ColorSupplier coloursSupplier = new ColorSupplier();
        Colors randomColor = coloursSupplier.getRandomColor();
        newRandomBall.setColor(randomColor.name());
        Random random = new Random();
        newRandomBall.setNumber(random.nextInt(BALL_NUMBER));
        return newRandomBall;
    }
}
