package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int maximumNumber = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Ball ball = new Ball(colorSupplier.getRandomColor(),new Random().nextInt(maximumNumber));
        return new Ball(ball.getColor(), ball.getNumber());
    }
}



