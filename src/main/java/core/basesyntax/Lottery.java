package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int maxNum = 101;

    public Ball getRandomBall() {
        int number = new Random().nextInt(maxNum);
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        return new Ball(color, number);
    }
}
