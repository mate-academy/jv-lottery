package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier;

    public Lottery() {
        colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
