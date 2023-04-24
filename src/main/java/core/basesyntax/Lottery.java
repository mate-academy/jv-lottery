package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private ColorSupplier colorSupplier;
    private static final int MAX_NUMBER = 100;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int magicNumber = random.nextInt(MAX_NUMBER);
        return new Ball(color, magicNumber);
    }
}
