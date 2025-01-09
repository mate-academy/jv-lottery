package core.basesyntax.classes;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int randomBounce = 100;
        Random random = new Random();
        ColorSupplier color = new ColorSupplier();
        return new Ball(color.getRandomColor(), random.nextInt(randomBounce));
    }
}
