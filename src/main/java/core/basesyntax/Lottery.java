package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int maxValue = 100;

        ColorSupplier colorSupplier = new ColorSupplier();

        String color = colorSupplier.getRandomColor();

        return new Ball(color, new Random().nextInt(maxValue));
    }
}
