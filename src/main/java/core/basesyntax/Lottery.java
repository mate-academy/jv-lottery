package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int MAX_NUMBER = 100;
        int randomNumber = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
