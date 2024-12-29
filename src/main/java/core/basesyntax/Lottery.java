package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Color color = colorSupplier.getRandomColor();
        int number = new Random().nextInt(101);

        return new Ball(color, number);
    }
}
