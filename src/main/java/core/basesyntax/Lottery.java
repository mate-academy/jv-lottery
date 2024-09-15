package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(101);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
