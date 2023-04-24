package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random random = new Random();
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().toString();
        int magicNumber = random.nextInt(100);
        return new Ball(color, magicNumber);
    }
}
