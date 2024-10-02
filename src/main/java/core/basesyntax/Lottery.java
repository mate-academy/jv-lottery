package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier ColorSupplier = new ColorSupplier();

    public Ball GetRandomBall() {
        ColorOfBall randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
