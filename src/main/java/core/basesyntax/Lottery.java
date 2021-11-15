package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball newBall = new Ball();
        newBall.setColor(colorSupplier.getRandomColor());
        newBall.setNumber(new Random().nextInt(101));
        return newBall;
    }
}
