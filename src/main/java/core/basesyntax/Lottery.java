package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        final int MaX_NuM = 100;
        String color;
        int number = random.nextInt(MaX_NuM);
        color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
