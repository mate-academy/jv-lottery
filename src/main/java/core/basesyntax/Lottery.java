package core.basesyntax;

import java.util.Random;

class Lottery {
    private static final int count = 100;
    private static final Random random = new Random();
    private static final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(random.nextInt(count));
        ball.setColor(String.valueOf(supplier.getRandomColor()));
        return ball;
    }
}
