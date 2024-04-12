package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int ballCount = 100;

    public String getRandomBall() {
        int ballNumber = new Random().nextInt(ballCount);
        String color = colorSupplier.getRandomColor();
        return " Ball Color " + color + " and number " + ballNumber;
    }
}
