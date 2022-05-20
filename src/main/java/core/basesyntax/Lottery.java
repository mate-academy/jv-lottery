package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int MAXIMUM_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(),new Random().nextInt(MAXIMUM_NUMBER));
        return new Ball(ball.getColor(), ball.getNumber());
    }
}
