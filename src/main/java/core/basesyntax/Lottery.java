package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    private final int maxValue = 100;
    private Random ballNumber = new Random();
    private ColorSupplier ballColor = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(ballColor.getRandomColor(),ballNumber.nextInt(maxValue));
    }
}
