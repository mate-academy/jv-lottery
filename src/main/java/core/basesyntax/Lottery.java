package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(colorSupplier.getRandomColor());
        newBall.setNumber(random.nextInt(101));
        return newBall;
    }
}
