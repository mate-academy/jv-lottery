package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int nubmerOfBalls = 100;
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(nubmerOfBalls);
        return new Ball(color, number);
    }
}
