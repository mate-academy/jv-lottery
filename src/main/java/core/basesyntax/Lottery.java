package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int limitingLine = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball winner = new Ball(colorSupplier.getRandomColor(),random.nextInt(limitingLine));
        return winner;
    }
}
