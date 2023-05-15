package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber = new Random();

    private final ColorSupplier color = new ColorSupplier();

    private final Ball ball = new Ball();

    public Ball getRandomBall() {
        ball.setNumber(randomNumber.nextInt(100));
        ball.setColor(color.getRandomColor());
        return ball;
    }

}
