package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random value = new Random();
        final int limit = 100;
        int num = value.nextInt(limit);
        return new Ball(color.getRandomColor().toString(), num);
    }
}
