package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_POSSIBLE_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        int randomNumber = new Random().nextInt(MAXIMUM_POSSIBLE_NUMBER);
        ball.setNumber(randomNumber);
        return ball;
    }
}
