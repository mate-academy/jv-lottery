package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball bl = new Ball();
        bl.setNumber((new Random()).nextInt(100));
        bl.setColor((new ColorSupplier()).getRandomColor());
        return bl;
    }
}
