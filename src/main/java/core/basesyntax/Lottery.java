package core.basesyntax;

import java.util.Random;

public class Lottery {
    private String color;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomBall = new Random();

    public Ball getRandomBall() {
        final int NuMBeR = randomBall.nextInt(100);
        color = colorSupplier.getRandomColor();
        return new Ball(color, NuMBeR);
    }
}
