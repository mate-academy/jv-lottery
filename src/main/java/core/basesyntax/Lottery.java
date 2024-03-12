package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();
        return new Ball(color, randomNumber);
    }
}
