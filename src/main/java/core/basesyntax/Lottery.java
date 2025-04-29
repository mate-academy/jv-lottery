package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        final int maxRandomValue = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball newBall = new Ball();
        newBall.setColor(colorSupplier.getRandomColor());
        newBall.setNumber(new Random().nextInt(maxRandomValue));
        return newBall;
    }
}
