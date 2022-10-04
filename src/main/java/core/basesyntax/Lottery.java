package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int BOUND = 100;

    public static Color getColor() {
        return ColorSupplier.getRandomColor();
    }

    public static int getNumber() {
        return new Random().nextInt(BOUND);
    }

    public Ball getRandomBall() {
        return new Ball(getColor(), getNumber());
    }
}
