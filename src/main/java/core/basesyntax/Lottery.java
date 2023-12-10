package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomColor() {

        int ballNumber = new Random().nextInt(1, 100);
        String ballColor = colorSupplier.getRandomColor();

        return new Ball(ballNumber, ballColor);
    }
}
