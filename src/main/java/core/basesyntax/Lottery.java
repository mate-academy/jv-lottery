package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorsupplier = new ColorSupplier();
        Ball ball = new Ball();
        Random number = new Random();
        ball.setNumber(number.nextInt(BOUND));
        ball.setColor(colorsupplier.getRandomColor());
        return ball;
    }
}
