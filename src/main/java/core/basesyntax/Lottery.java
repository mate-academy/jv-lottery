package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MX = 100;
    private Random randomNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), randomNumber.nextInt(MX + 1));
    }
}
