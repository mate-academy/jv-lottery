package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
