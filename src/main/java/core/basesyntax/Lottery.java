package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomNumber = new Random().nextInt(BOUND);
        return new Ball(randomColor,randomNumber);
    }
}
