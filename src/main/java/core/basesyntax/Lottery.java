package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(100 + 1));
        return ball;
    }
}
