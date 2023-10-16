package core.basesyntax;

import java.util.Random;

public class Lottery {
    ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        Ball.color = String.valueOf(colorSupplier.getRandomColor());
        Ball.number = new Random().nextInt(100);
        return new Ball();
    }
}
