package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball bl = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        bl.setColor(colorSupplier.getRandomColor());
        Random random = new Random();
        bl.setNumber(random.nextInt(100));
        return bl;
    }
}
