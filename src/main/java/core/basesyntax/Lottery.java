package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {

    private static final int MaxNumber = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setcolor(colorSupplier.getRandomColor().toString());
        ball.setnumber(random.nextInt(MaxNumber));
        return ball;

    }
}

