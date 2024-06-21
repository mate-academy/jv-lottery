package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);

        return new Ball(color,number);
    }
}
