package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int BOUND = 100;
    public Ball getRandomBall() {
        Random rand = new Random();
        int ballNumber = rand.nextInt(BOUND);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        return new Ball(color, ballNumber);
    }
}
