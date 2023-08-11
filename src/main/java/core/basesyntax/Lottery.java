package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier randomColour = new ColorSupplier();
        Random random = new Random();

        ball.setColour(randomColour.getRandomColor());
        ball.setNumber(random.nextInt(100));
        return ball;
    }
}
