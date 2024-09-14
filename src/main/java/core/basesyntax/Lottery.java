package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();

    public Ball getRandomBall() {
        int randomNumber = RANDOM.nextInt(101);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        return new Ball(randomColor, randomNumber);
    }
}
