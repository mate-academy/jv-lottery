package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball newBall = new Ball();
        newBall.setColor(colorSupplier.getRandomColor());
        newBall.setNumber(new Random().nextInt(100));
        return newBall;
    }
}
