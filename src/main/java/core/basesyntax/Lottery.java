package core.basesyntax;

import java.util.Random;

class Lottery {
    private Ball ball = new Ball();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Random random = new Random();
        ball.setNumber(random.nextInt(100));
        ball.setColor(colorSupplier.getRandomColor());
        return ball;
    }
}
