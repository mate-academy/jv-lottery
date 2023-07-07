package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;

    public Lottery() {
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return new Ball(color, number);
    }
}
