package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomColor() {

        int ballNumber = random.nextInt(1, 101);
        String ballColor = colorSupplier.getRandomColor();

        return new Ball(ballNumber, ballColor);
    }
}
