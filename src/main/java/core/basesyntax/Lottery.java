package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Ball winner = new Ball();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        winner.setColor(colorSupplier.getRandomColor());
        winner.setNumber(random.nextInt(100));
        return winner;

    }
}
