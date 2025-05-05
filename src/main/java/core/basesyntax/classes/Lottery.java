package core.basesyntax.classes;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        final int RANDOM_BOUNCE = 100;
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), random.nextInt(RANDOM_BOUNCE));
    }
}
