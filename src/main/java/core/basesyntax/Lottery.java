package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int bound = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(bound);
        return new Ball(randomColor, randomNumber);
    }
}
