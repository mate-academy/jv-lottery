package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Ball getRandomBall() {
        Ball.setColor(String.valueOf(getColorSupplier().getRandomColor()));
        Ball.setNumber(new Random().nextInt(100));
        return new Ball();
    }
}
