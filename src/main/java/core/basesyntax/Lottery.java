package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Colors color = colorSupplier.getRandomColor();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
