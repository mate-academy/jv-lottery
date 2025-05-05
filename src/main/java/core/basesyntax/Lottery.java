package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball();
        int maxNumber = 100;
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(maxNumber));
        return ball;
    }
}
