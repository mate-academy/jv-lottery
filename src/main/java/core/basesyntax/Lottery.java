package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomColor() {
        return new Ball(new Random().nextInt(100), new ColorSupplier().getRandomColor());
    }
}
