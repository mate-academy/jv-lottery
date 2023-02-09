package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int number = new Random().nextInt(BOUND);
    private String colorStr = colorSupplier.getRandomColor();

    public Ball getRandomBall() {

        return new Ball(colorStr, number);
    }
}
